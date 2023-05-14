package com.wastewizard.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class MainController {
    @GetMapping
    public String helloWorld() {
        return "Hello world spring";
    }
}
