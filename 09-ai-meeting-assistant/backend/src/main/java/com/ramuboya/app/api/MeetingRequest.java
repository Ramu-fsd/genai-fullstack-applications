package com.ramuboya.app.api;
import jakarta.validation.constraints.NotBlank;
public record MeetingRequest(@NotBlank String meetingText) {}
