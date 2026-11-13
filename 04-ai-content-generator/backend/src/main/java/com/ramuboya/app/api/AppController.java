package com.ramuboya.app.api;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/content")
public class AppController {
 @PostMapping("/generate") public ContentResponse execute(@Valid @RequestBody ContentRequest request){  return new ContentResponse("Demo draft for "+request.contentType()+" in "+request.tone()+" tone. Topic: "+request.topic()+". Connect an LLM provider for real generation.");  }
}
