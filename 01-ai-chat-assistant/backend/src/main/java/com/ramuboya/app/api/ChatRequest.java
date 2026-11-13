package com.ramuboya.app.api;
import jakarta.validation.constraints.*;
public record ChatRequest(@NotBlank String message) {}
