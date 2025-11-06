### 1. Installation:

```json5

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