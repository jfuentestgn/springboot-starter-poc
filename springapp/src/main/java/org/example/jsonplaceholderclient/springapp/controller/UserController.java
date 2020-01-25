package org.example.jsonplaceholderclient.springapp.controller;

import org.example.jsonplaceholderclient.springapp.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    private final DemoService demoService;

    public UserController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/main/{id}")
    public ModelAndView showUser(@PathVariable String id) {
        ModelAndView mv = new ModelAndView("main/show");
        mv.addObject("id", id);
        mv.addObject("user", demoService.getUserName(Integer.parseInt(id)));
        return mv;
    }
}
