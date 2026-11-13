# SQL assistant safety model

Use schema allowlists. Parse generated SQL and reject DDL, DML, multiple statements and disallowed functions. Use read-only credentials, database-side timeouts and row limits. Require approval for sensitive or expensive queries. Audit SQL, reviewer and execution outcome. Never execute unreviewed model output.