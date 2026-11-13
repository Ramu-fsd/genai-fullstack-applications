package com.ramuboya.app.api;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class AppController {
 @PostMapping("/chat") public ChatResponse execute(@Valid @RequestBody ChatRequest request){  return service.chat(request);  }
}
