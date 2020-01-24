package org.example.jsonplaceholderclient.springapp.controller;

import org.example.jsonplaceholderclient.springapp.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/user/{id}")
    public String getUserName(@PathVariable String id) {
        return this.demoService.getUserName(Integer.parseInt(id));
    }
}
