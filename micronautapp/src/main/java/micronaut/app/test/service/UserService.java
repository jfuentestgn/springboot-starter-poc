package micronaut.app.test.service;

import javax.inject.Singleton;
import org.example.jsonplaceholderclient.*;

@Singleton
public class UserService {

    private final JsonPlaceHolderClient jsonPlaceHolderClient;

    public UserService(JsonPlaceHolderClient jsonPlaceHolderClient) {
        this.jsonPlaceHolderClient = jsonPlaceHolderClient;
    }

    public User getUser(int id) {
        return this.jsonPlaceHolderClient.getUser(id);
    }
}
