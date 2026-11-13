package com.ramuboya.app.api;
import jakarta.validation.constraints.NotBlank;
public record SupportRequest(@NotBlank String ticketId,@NotBlank String message) {}
