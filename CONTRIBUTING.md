# Contributing

Thank you for your interest in improving this learning repository.

## Contribution guidelines

1. Keep each project self-contained and document its prerequisites.
2. Prefer small, focused changes with clear commit messages.
3. Include tests for meaningful backend and frontend behavior.
4. Document API contracts, configuration, and architectural decisions.
5. Never commit credentials, tokens, private keys, customer data, or production secrets.
6. Clearly distinguish working integrations from mocks, demos, and planned functionality.

## Before submitting a change

- Build and test the affected backend with the documented Maven commands.
- Install dependencies and run the documented frontend checks.
- Update the relevant project README when behavior or setup changes.
- Review security, privacy, accessibility, and error-handling implications.

## Suggested commit style

Use concise conventional-style messages, for example:

- `feat(chat): add conversation history endpoint`
- `fix(streaming): handle client disconnect`
- `docs(rag): clarify ingestion flow`
- `test(sql): cover unsafe query rejection`
