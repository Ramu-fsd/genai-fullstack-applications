# 10 — AI Financial Insights Platform

**Author:** Rama Boya  
**GitHub:** https://github.com/ramu-fsd  
**LinkedIn:** https://www.linkedin.com/in/ramuboya

## Overview
Explore financial metrics and produce a guarded narrative from supplied sample metrics.

## Technology
React, TypeScript, Vite, Java 21, Spring Boot and Maven.

## Run backend
```bash
cd backend
mvn spring-boot:run
```

## Run frontend
In a second terminal:
```bash
cd frontend
npm install
npm run dev
```
Open http://localhost:5173. The default API URL is http://localhost:8080. Copy `.env.example` to `.env` to override `VITE_API_BASE_URL`.

## Implementation status
This is a full-stack learning scaffold with deterministic demo responses. It does not call an LLM, connect to production data, or execute external actions. Integrate approved providers and complete security, privacy and operational controls before real use.
