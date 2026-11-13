package com.ramuboya.app.api;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/v1/insights")
public class AppController {
 @PostMapping("/generate") public FinancialInsightResponse execute(@Valid @RequestBody FinancialInsightRequest request){return new FinancialInsightResponse("Demo narrative based only on supplied context: "+request.businessContext(),"Illustrative output; validate all figures against governed financial sources.");}
}
