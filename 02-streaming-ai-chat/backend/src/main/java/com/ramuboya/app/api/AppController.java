package com.ramuboya.app.api;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/v1")
public class AppController {
 @PostMapping(value="/chat/stream",produces=MediaType.TEXT_EVENT_STREAM_VALUE) public Flux<String> execute(@Valid @RequestBody ChatRequest request){  String text="Demo stream for: "+request.message()+". Connect a streaming LLM adapter."; return Flux.fromArray(text.split(" ")).map(word -> "data: "+word+"\\n\\n");  }
}
