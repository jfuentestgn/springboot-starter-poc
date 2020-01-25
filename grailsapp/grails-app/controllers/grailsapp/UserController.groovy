package grailsapp

class UserController {

    UserService userService

    def show(int id) {
        [user: userService.getUser(id)]
    }
}
