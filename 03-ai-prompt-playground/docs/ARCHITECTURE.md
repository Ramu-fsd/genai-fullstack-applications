# AI Prompt Playground — Architecture Notes

## Components
- React + TypeScript browser application.
- Java 21 / Spring Boot API.
- Provider-neutral application boundary; model provider is not configured in this starter.

## Production considerations
- Configure explicit CORS origins.
- Authenticate users using OIDC/JWT and enforce authorization server-side.
- Apply request validation, rate limits, model timeouts and bounded retries.
- Store provider credentials in a secrets manager.
- Add tracing, latency and token/cost metrics.
- Avoid logging secrets or unnecessary personal/sensitive prompt content.
- Treat prompts and retrieved content as untrusted input.
