package jsonplaceholderclientplugin

import jsonplaceholderplugin.UserService
import org.example.jsonplaceholderclient.User

class JsonplaceholderTagLib {

    UserService userService

//    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    def userInfo = { attrs, body ->
        User u = userService.getUser(attrs.id)
        out << render(template: "userInfoTemplate", model: [user: u])
    }
}
