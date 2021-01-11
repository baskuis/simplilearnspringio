package com.example.simplilearnspringio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/v2")
@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello")
    String hello() {
        return "Hello from our rest controller";
    }

}
