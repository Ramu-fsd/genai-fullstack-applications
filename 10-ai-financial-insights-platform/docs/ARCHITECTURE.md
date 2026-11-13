# AI Financial Insights Platform — Architecture

React UI → Spring Boot API → validation and policy boundary → replaceable AI / domain adapter → structured response.

Production design should include OIDC/JWT, server-side authorization, secrets management, rate limits, timeouts, audit events, observability, privacy controls and human approval for consequential actions. Treat all user input and model output as untrusted.
