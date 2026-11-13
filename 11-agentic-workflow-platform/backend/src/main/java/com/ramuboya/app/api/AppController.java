package com.ramuboya.app.api;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/v1/agents")
public class AppController {
 @PostMapping("/plan") public AgentPlanResponse execute(@Valid @RequestBody AgentPlanRequest request){return new AgentPlanResponse("Proposed workflow only: "+request.objective(),List.of("Validate permissions","Require human approval before side effects"),false);}
}
