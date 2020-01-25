package org.example.jsonplaceholderclient.springapp.service;

import org.example.jsonplaceholderclient.JsonPlaceHolderClient;
import org.example.jsonplaceholderclient.User;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    private final JsonPlaceHolderClient jsonPlaceHolderClient;

    public DemoService(JsonPlaceHolderClient jsonPlaceHolderClient) {
        this.jsonPlaceHolderClient = jsonPlaceHolderClient;
    }

    public String getUserName(int userId) {
        User user = this.jsonPlaceHolderClient.getUser(userId);
        return user.getName();
    }

    public User getUserInfo(int userId) {
        return this.jsonPlaceHolderClient.getUser(userId);
    }
}
