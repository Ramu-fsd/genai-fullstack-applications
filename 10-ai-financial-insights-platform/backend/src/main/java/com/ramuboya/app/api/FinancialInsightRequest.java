package com.ramuboya.app.api;
import jakarta.validation.constraints.NotBlank;
public record FinancialInsightRequest(@NotBlank String businessContext) {}
