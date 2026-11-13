# Enterprise banking GenAI reference architecture

## Logical flow
Channel UI → API gateway → OIDC/JWT validation → policy and entitlement service → orchestration layer → authorized retrieval / approved tools → model gateway → response validation → cited answer.

## Platform capabilities
- Tenant and document-level authorization enforced during retrieval.
- Approved model registry, prompt/version governance and provider abstraction.
- RAG over policy and procedure content with source provenance and effective dates.
- Human approval for consequential actions; read-only defaults for tools.
- Audit events, OpenTelemetry traces, latency/token/cost metrics and SIEM integration.
- Secrets management, encryption, retention, deletion propagation and private networking.

## Banking controls
Do not let the model make credit, fraud, payment release, sanctions or customer eligibility decisions autonomously. Use deterministic policy services and authorized human decision-makers. Validate all outputs and cite approved sources.

This capstone is a reference API skeleton; it is not a complete banking solution or connected to production systems.