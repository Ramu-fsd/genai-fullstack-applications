package com.ramuboya.app.api;
import jakarta.validation.constraints.NotBlank;
public record DocumentQuestionRequest(@NotBlank String documentText,@NotBlank String question) {}
