package co.imp.tech.controller;

import co.imp.tech.service.ComsumeClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ConsumeClientController {

private final ComsumeClientService consumeClient;

    @GetMapping("/request-monitor/{size}/{page}")
    public ResponseEntity<?> requestMonitor(@PathVariable int size, @PathVariable int page) {

        return ResponseEntity.ok().body(consumeClient.monitorRequest(size, page));
    }
}
