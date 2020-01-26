package myapp

class UserController {

    UserService userService

    def index() { }

    def show(int id) {
        [user: userService.getUser(id)]
    }
}
