package com.sa.web;

import com.sa.web.dto.SentenceDto;
import com.sa.web.dto.SentimentDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "*")
@RestController
public class SentimentController {

    @Value("${sa.logic.api.url}")
    private String saLogicApiUrl;

    private static final RestTemplate REST_TEMPLATE = new RestTemplateBuilder().build();

    @PostMapping("/sentiment")
    public SentimentDto sentimentAnalysis(@RequestBody SentenceDto sentenceDto) {
        return REST_TEMPLATE
                .postForEntity(saLogicApiUrl + "/analyse/sentiment", sentenceDto, SentimentDto.class)
                .getBody();
    }

    @GetMapping("/testHealth")
    public ResponseEntity<String> testHealth() {
        return ResponseEntity.ok("{\"status\":\"UP\"}");
    }
}


