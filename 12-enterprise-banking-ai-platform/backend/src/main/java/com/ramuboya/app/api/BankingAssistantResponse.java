package com.ramuboya.app.api;
import java.util.List;
public record BankingAssistantResponse(String answer,List<String> sources,String safetyNotice) {}
