package myapp

class UserController {

    def index() { }

    def show(int id) {
        [userId: id]
    }
}
