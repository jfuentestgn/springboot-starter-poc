package org.example.springappgroovy.service

import org.example.jsonplaceholderclient.JsonPlaceHolderClient
import org.example.jsonplaceholderclient.User
import org.springframework.stereotype.Service

@Service
class UserService {

    private final JsonPlaceHolderClient jsonPlaceHolderClient

    UserService(JsonPlaceHolderClient jsonPlaceHolderClient) {
        this.jsonPlaceHolderClient = jsonPlaceHolderClient
    }

    String getUserName(int userId) {
        User user = this.jsonPlaceHolderClient.getUser(userId)
        return user.name
    }

    User getUserInfo(int userId) {
        this.jsonPlaceHolderClient.getUser(userId)
    }
}
