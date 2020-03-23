package com.shaikh.itemtrackerservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/healthCheck")
    public ResponseEntity<Map<String, String>> checkHealth(){
        Map<String, String> healthCheck = new HashMap<>();
        healthCheck.put("status", "UP");
        return new ResponseEntity<>(healthCheck, HttpStatus.OK);
    }
}
