package com.ramuboya.app.api;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/prompts")
public class AppController {
 @PostMapping("/execute") public PromptResponse execute(@Valid @RequestBody PromptRequest request){  return new PromptResponse("Demo mode. Configure a model provider to generate a completion. Temperature="+request.temperature());  }
}
