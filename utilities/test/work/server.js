const express = require('express');
const path = require('path');




const OpenApiValidator = require('express-openapi-validator');
const YAML = require('yamljs');




// --- Configuration ---
const apiSpec = path.join(__dirname, 'openapi.yaml');
const app = express();
const port = 3000;

app.use(express.json());
app.use(express.text());
app.use(express.urlencoded({ extended: false }));
app.use(express.json());

// Middleware for URL-encoded bodies (often necessary)
app.use(express.urlencoded({ extended: false }));

// Load the OpenAPI spec
const apiDocument = YAML.load(apiSpec);

app.use(
    OpenApiValidator.middleware({
        apiSpec: './openapi.yaml',
        validateResponses: true,
    })
);


        app.post('/part-searches', (req, res) => {
            console.log('Request Body is Valid:', req.body);
            // If we reach this point, the request body matched PartSearch_Create schema.
            res.status(201).json({
                message: 'PartSearch created successfully (Validated by express-openapi-validator!)',
                data: req.body
            });
        });


        app.get('/part-searches', (req, res) => {
            // req.query.limit must be an integer between 1 and 100, and defaults to 50 if missing.
            const limit = req.query.limit || 50;
            console.log(`Request Query is Valid. Limit: ${limit}`);
            res.status(200).json([]); // Send an empty array to simulate a valid 200 response
        });


        app.use((err, req, res, next) => {
            // log the error
            console.error(err);
            // Respond with the specific 400 Bad Request error the validator generates
            res.status(err.status || 500).json({
                message: err.message,
                errors: err.errors,
            });
        });


        app.listen(port, () => {
            console.log(`\n🎉 Server listening at http://localhost:${port}`);
            console.log('OpenAPI Spec Validation is ACTIVE.');

            console.log('\n--- Test Scenarios ---');
            console.log('1. Valid Query:   GET /part-searches?limit=10  => 200 OK');
            console.log('2. Invalid Query: GET /part-searches?limit=500 => 400 Bad Request (limit > 100)');
            console.log('3. Valid Body:    POST /part-searches (if body matches schema) => 201 Created');
            console.log('4. Invalid Body:  POST /part-searches (if body is missing fields) => 400 Bad Request');
        });

