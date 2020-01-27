package org.example.springappgroovy.controller

import org.example.jsonplaceholderclient.User
import org.example.springappgroovy.service.UserService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.servlet.ModelAndView

@Controller
class UserController {

    UserService userService

    UserController(UserService userService) {
        this.userService = userService
    }

    @GetMapping("/user/show/{id}")
    ModelAndView showUser(@PathVariable String id) {
        User u = userService.getUserInfo(Integer.parseInt(id))
        new ModelAndView('user/show', [id: id, user: u])
    }
}