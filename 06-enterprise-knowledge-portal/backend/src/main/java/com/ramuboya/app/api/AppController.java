package com.ramuboya.app.api;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/v1/knowledge/search")
public class AppController {
 @PostMapping public KnowledgeSearchResponse execute(@Valid @RequestBody KnowledgeSearchRequest request){return new KnowledgeSearchResponse("Demo mode: no enterprise knowledge connector is configured.",List.of());}
}
