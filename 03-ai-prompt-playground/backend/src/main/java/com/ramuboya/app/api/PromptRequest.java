package com.ramuboya.app.api;
import jakarta.validation.constraints.*;
public record PromptRequest(@NotBlank String systemPrompt,@NotBlank String userPrompt,@DecimalMin("0.0") @DecimalMax("1.0") double temperature) {}
