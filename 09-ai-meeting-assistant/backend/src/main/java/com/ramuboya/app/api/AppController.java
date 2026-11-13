package com.ramuboya.app.api;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/v1/meetings")
public class AppController {
 @PostMapping("/summarize") public MeetingResponse execute(@Valid @RequestBody MeetingRequest request){return new MeetingResponse("Demo summary: "+request.meetingText(),List.of("Review and validate the extracted action items"));}
}
