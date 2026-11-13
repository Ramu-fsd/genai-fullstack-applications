package com.ramuboya.app.api;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/v1/banking")
public class AppController {
 @PostMapping("/assistant") public BankingAssistantResponse execute(@Valid @RequestBody BankingAssistantRequest request){return new BankingAssistantResponse("Demo response. Configure approved policy retrieval and a governed model gateway.",List.of(),"Do not use this starter for customer or operational decisions.");}
}
