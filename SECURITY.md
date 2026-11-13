# Security Policy

## Scope

This repository contains educational and portfolio-oriented starter applications. Do not assume that a project is production-ready or suitable for processing confidential, regulated, or personal information.

## Reporting a vulnerability

Please do not disclose exploitable details in a public issue. Contact the repository maintainer through the contact options available on the GitHub profile:

https://github.com/ramu-fsd

Include:
- A concise description of the issue.
- The affected project and version/commit.
- Reproduction steps and potential impact.
- Any suggested mitigation, if known.

## Secure development expectations

- Keep secrets outside source control.
- Enforce authentication and authorization on the backend.
- Validate and constrain user input and model output.
- Apply tenant and document-level access controls to retrieval.
- Treat model output as untrusted input.
- Do not execute generated SQL or agent actions without explicit policy enforcement and authorization.
- Add rate limits, audit events, monitoring, and cost controls before exposing endpoints.
