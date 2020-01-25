package grailsapp

import org.example.jsonplaceholderclient.JsonPlaceHolderClient
import org.example.jsonplaceholderclient.User

class UserService {

    JsonPlaceHolderClient jsonPlaceHolderClient

    User getUser(int i) {
        return jsonPlaceHolderClient.getUser(i)
    }
}
