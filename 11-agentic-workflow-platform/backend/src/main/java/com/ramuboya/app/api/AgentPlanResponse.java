package com.ramuboya.app.api;
import java.util.List;
public record AgentPlanResponse(String result,List<String> approvalGates,boolean executed) {}
