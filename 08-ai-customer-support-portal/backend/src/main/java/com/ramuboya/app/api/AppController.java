package com.ramuboya.app.api;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/v1/support/ask")
public class AppController {
 @PostMapping public SupportResponse execute(@Valid @RequestBody SupportRequest request){return new SupportResponse("Demo response for ticket "+request.ticketId()+". Connect authorized support knowledge and ticket workflow services.","NOT_CONFIGURED");}
}
