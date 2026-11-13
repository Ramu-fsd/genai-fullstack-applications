package com.ramuboya.app.api;
import jakarta.validation.constraints.NotBlank;
public record KnowledgeSearchRequest(@NotBlank String query) {}
