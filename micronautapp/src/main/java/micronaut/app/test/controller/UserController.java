package micronaut.app.test.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import micronaut.app.test.service.UserService;

@Controller("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Get(value = "/name/{id}", produces = MediaType.TEXT_PLAIN)
    public String getName(@PathVariable String id) {
        return this.userService.getUser(Integer.parseInt(id)).getName();
    }
}
