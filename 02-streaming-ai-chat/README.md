# 02 — Streaming AI Chat

**Author:** Rama Boya  
**GitHub:** https://github.com/ramu-fsd  
**LinkedIn:** https://www.linkedin.com/in/ramuboya

## Overview
Full-stack application using React + TypeScript + Vite and Java 21 + Spring Boot.

## Architecture
Browser UI → REST/SSE API → Spring Boot application → replaceable AI provider integration.

## Prerequisites
- Java 21
- Maven 3.9+
- Node.js 20+ and npm

## Start backend
```bash
cd backend
mvn spring-boot:run
```

## Start frontend
In a second terminal:
```bash
cd frontend
npm install
npm run dev
```
Open http://localhost:5173. The default API URL is http://localhost:8080. Copy `.env.example` to `.env` to override `VITE_API_BASE_URL`.

## Implementation status
The backend currently returns deterministic demo output and does not call an LLM. This demonstrates the full-stack contract and UI flow. Add an approved Spring AI / Amazon Bedrock adapter before presenting it as model-generated output. Configure CORS, authentication, authorization, rate limits, secret management and observability before deployment.
