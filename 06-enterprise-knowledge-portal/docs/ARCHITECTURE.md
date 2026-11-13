# Enterprise Knowledge Portal — Architecture

React browser UI → Spring Boot API → validation and authorization → replaceable retrieval / AI / business adapter → response.

Production integrations should include OIDC/JWT, server-side authorization, approved Spring AI / Bedrock model gateway, rate limits, timeouts, audit events, tracing and privacy-aware logging. Treat user input, retrieved content and model output as untrusted.
