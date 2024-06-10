package com.example.util;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Controller {

    @PostMapping("/test")
    @LogExecutionTime
    public String test(@RequestBody Map<String, String> input) {

        return "success";
    }
}
