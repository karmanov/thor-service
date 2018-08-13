package io.karmanov.marvel.thor.controller;

import io.karmanov.marvel.thor.dto.PingResponseDTO;
import org.joda.time.DateTime;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping(value = "/thor/api/v1/ping", produces = MediaType.APPLICATION_JSON_VALUE)
    public PingResponseDTO ping() {
        return new PingResponseDTO("Ping message", DateTime.now());
    }
}
