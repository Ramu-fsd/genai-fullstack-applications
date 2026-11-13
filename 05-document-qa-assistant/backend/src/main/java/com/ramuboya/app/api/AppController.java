package com.ramuboya.app.api;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/v1/documents/ask")
public class AppController {
 @PostMapping public DocumentQuestionResponse execute(@Valid @RequestBody DocumentQuestionRequest request){return new DocumentQuestionResponse("Demo mode: received "+request.documentText().length()+" characters. Connect parsing, chunking, embeddings, authorized retrieval and an LLM.",List.of());}
}
