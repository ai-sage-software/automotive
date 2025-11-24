### 1. Installation:
https://www.npmjs.com/package/express-openapi-validator




```json5
npm install -g npm@11.6.2
npm install express-openapi-validator

```

### 2. Integration (Example for Express.js): 

You add the middleware early in your application startup:

```json5

const express = require('express');
const path = require('path');
const { OpenApiValidator } = require('express-openapi-validator');

const app = express();
app.use(express.json()); // Body parser is required

// Add the validator middleware
app.use(
  OpenApiValidator.middleware({
    apiSpec: path.join(__dirname, 'your-openapi-spec.yaml'), // Path to your OAS file
    validateRequests: true, // Validate incoming requests
    validateResponses: true, // Validate outgoing responses (set to false by default)
  }),
);

// ... Define your API routes here ...

// Error handler must be defined after the validator
app.use((err, req, res, next) => {
  // Custom error handling for validation errors
  res.status(err.status || 500).json({
    message: err.message,
    errors: err.errors,
  });
});

// Start your server
// app.listen(...)

```

### 3. Testing: 

* If a client sends a request with a missing required parameter, an incorrect data type, or extra fields not defined in the spec, the middleware will reject the request and return a 400 Bad Request with validation details.

<br />

* If your route handler returns a response that doesn't match the schema for the specified status code (e.g., missing a required field in the 200 response), the middleware will throw an error on the server side (if validateResponses is true).