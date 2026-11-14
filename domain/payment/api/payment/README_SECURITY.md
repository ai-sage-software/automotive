# 🚗 STAR Security Contract for Payment API
This README provides an overview of the security architecture and implementation requirements for the **Automotive Retail Systems Payment API**.
All developers and integrators must adhere to these standards to ensure the integrity and confidentiality of automotive retail Payment data.

---

## Security Architecture: Automotive Retail Systems API

This API employs a **layered security model** to protect resources. Access is governed by the STAR Standard requirements and requires valid credentials for all endpoints, excluding the health check.

## 1. Authentication & Authorization Schemes

The API supports two primary security schemes as defined in the `openapi.yaml`. Depending on the client type and use case, one or both may be required.

### A. Industry OAuth 2.0 (`industry-oauth`)

This is the primary method for standardized, scoped access.

* **Type:** OAuth 2.0
* **Flow:** Typically Client Credentials or Authorization Code (refer to STAR Standard identity provider docs).
* **Scopes:**
* `standard:read`: Required for all `GET` operations.
* `standard:write`: Required for `POST`, `PUT`, `PATCH`, and `DELETE` operations.



### B. Member API Key (`member-api-key`)

Used for identifying the specific organizational member or dealership system making the request.

* **Type:** API Key
* **Location:** Header (typically `X-API-KEY` or as defined by the gateway).
* **Purpose:** Provides secondary validation and usage auditing.

---

## 2. Security Application Logic

The API applies security following an **"OR" logic** for global requirements, with specific overrides for public utility endpoints.

### Global Security

Most endpoints (e.g., `/payments`, `/payments/batch`) require authentication. A request is considered authorized if it satisfies **either** the OAuth2 requirements **or** provides a valid Member API Key:

```yaml
security:
- industry-oauth: [ "standard:read" ]
- member-api-key: []
- {} # Allows fallback/optional in certain gateway configurations

```

### Public Endpoints

The following endpoints are explicitly marked as public (no security required) to allow for infrastructure monitoring and discovery:

* `GET /payments/health`: Used by load balancers and uptime monitors.

---

## 3. Mandatory Security Headers

In addition to authentication tokens, all requests must include the following headers for compliance and auditing:

| Header | Description | Required |
| --- | --- | --- |
| `standards-version` | Identifies the version of the STAR Standards being used. | **Yes** |
| `If-Match` | Used in `PUT` and `PATCH` requests to prevent "lost updates" (ETag validation). | **Yes** |
| `Idempotency-Key` | Used in bulk exports to prevent duplicate job creation. | Optional |

---

## 4. Webhook Security (Callbacks)

When using the `/payments/exports` endpoint, the system sends a POST notification to your `webhook_url`. To secure this communication:

1. **Signature Key:** You must provide a `signature_key` in the initial request.
2. **Verification:** The API will use this key to sign the payload. Your listener must verify this signature to ensure the notification originated from the Automotive Retail System and hasn't been tampered with.

---

## 5. Error Handling & Security

The API uses a standardized `ErrorDetail` schema. For security reasons:

* **401 Unauthorized:** Returned when credentials are missing or invalid.
* **403 Forbidden:** Returned when credentials are valid but the user lacks the necessary scopes (e.g., trying to `DELETE` with only `standard:read`).
* **Data Masking:** The `rejectedValue` field in error responses will only return data if it is deemed non-sensitive.

---

## 6. Implementation Checklist

* [ ] Obtain OAuth2 credentials from the Identity Provider.
* [ ] Generate a Member API Key
* [ ] Ensure all requests include the `standards-version` header.
* [ ] Implement ETag handling (reading `ETag` from responses and sending `If-Match` in updates).
* [ ] Set up a TLS 1.2+ encrypted listener for Webhook callbacks.

