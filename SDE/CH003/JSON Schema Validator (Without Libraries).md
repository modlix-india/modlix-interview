# Challenge: JSON Schema Validator (Without Libraries)

## Problem Statement

You need to implement a JSON Schema Validator from scratch, ensuring that a given JSON object adheres to a defined schema.

For more information about JSON Schema, visit [json-schema.org](https://json-schema.org/).

## Requirements

The program should take two JSON inputs:
- Schema (defines the expected structure and constraints)
- Data (the JSON object to validate)

- Implement a custom validation function that checks if the JSON object conforms to the schema
- If the JSON object is valid, return "Valid JSON"; otherwise, return a detailed error message

## Example Usage

### Input

JSON Schema:
```json
{
  "type": "object",
  "properties": {
    "name": { "type": "string" },
    "age": { "type": "integer", "minimum": 18 }
  },
  "required": ["name", "age"]
}
```
JSON Object Valid:
```json
{
  "name": "Alice",
  "age": 25
}
```
JSON Object InValid:
```json
{
  "name": "Bob",
  "age": "twenty"
}
```

## Expected Output

Valid Case: "Valid JSON"
Invalid Case: "Error: 'age' should be an integer"

## Constraints

- No external libraries (write the validation logic manually)
- The JSON schema must support at least:
  - Basic types (string, integer, boolean, object, array)
  - Required fields
  - Minimum/maximum values for numbers
- Edge cases should be handled, such as:
  - Missing required fields
  - Mismatched data types

## Bonus Challenges (Optional)

1. Support nested objects and arrays
2. Implement custom validation rules (e.g., regex patterns for strings)
