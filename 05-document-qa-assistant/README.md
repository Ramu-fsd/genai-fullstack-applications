# 05 — Document QA Assistant

**Author:** Rama Boya  
**GitHub:** https://github.com/ramu-fsd  
**LinkedIn:** https://www.linkedin.com/in/ramuboya

## Overview
Upload text documents and ask questions through a RAG-oriented API contract.

## Technology
React, TypeScript, Vite, Java 21, Spring Boot, Maven and REST APIs.

## Run backend
```bash
cd backend
mvn spring-boot:run
```

## Run frontend
In another terminal:
```bash
cd frontend
npm install
npm run dev
```
Open http://localhost:5173. The default API URL is http://localhost:8080. Copy `.env.example` to `.env` to override `VITE_API_BASE_URL`.

## Implementation status
This is a learning scaffold. The backend returns deterministic demo responses; no LLM, vector database, enterprise identity provider or external business connector is configured. Complete the documented security controls before connecting real data.
