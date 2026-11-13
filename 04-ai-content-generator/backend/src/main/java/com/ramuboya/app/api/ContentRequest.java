package com.ramuboya.app.api;
import jakarta.validation.constraints.*;
public record ContentRequest(@NotBlank String topic,@NotBlank String contentType,@NotBlank String tone) {}
