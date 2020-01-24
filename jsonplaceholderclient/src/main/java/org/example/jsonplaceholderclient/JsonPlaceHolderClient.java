package org.example.jsonplaceholderclient;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class JsonPlaceHolderClient {

    private final String serverURL;

    public JsonPlaceHolderClient(String serverURL) {
        this.serverURL = serverURL;
    }

    public User getUser(int userId) {
        RestTemplate rt = new RestTemplate();
        MappingJackson2HttpMessageConverter jsonMessageConverter = new MappingJackson2HttpMessageConverter();
        rt.getMessageConverters().add(jsonMessageConverter);
        String url = this.serverURL + "/users/{id}";
        ResponseEntity<User> response = rt.getForEntity(url, User.class, userId);
        return response.getBody();
    }

}
