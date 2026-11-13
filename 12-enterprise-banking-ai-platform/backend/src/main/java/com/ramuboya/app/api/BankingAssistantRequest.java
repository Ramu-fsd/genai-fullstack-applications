package com.ramuboya.app.api;
import jakarta.validation.constraints.NotBlank;
public record BankingAssistantRequest(@NotBlank String question) {}
