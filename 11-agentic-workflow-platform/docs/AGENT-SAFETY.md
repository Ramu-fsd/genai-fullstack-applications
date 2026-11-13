# Agent safety and orchestration

- Use a finite-state workflow with explicit, typed tools and least-privilege scopes.
- Separate planning from execution; validate every tool argument server-side.
- Require human approval before external side effects, payments, account changes or data disclosure.
- Apply per-run budgets, step limits, timeouts, idempotency keys and cancellation.
- Treat retrieved content and tool output as untrusted instructions/data.
- Log plan, tool call, actor, approval, result and correlation ID.

This starter returns a proposed plan only. It does not execute tools or invoke an LLM.