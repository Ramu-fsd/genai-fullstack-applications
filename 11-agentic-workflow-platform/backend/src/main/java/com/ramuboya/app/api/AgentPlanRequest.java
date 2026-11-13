package com.ramuboya.app.api;
import jakarta.validation.constraints.NotBlank;
public record AgentPlanRequest(@NotBlank String objective) {}
