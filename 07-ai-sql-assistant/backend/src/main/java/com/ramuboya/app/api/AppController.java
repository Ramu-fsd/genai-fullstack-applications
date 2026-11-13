package com.ramuboya.app.api;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/v1/sql/generate")
public class AppController {
 @PostMapping public SqlDraftResponse execute(@Valid @RequestBody SqlQuestionRequest request){return new SqlDraftResponse("-- Demo only: connect schema-aware SQL generation.\n-- Do not execute unreviewed model output.","No SQL generated. Configure schema metadata and a model provider.",false);}
}
