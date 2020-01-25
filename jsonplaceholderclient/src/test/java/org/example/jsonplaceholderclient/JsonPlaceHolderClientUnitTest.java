package org.example.jsonplaceholderclient;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonPlaceHolderClientUnitTest {

    @Test
    public void testGetUser() {
        JsonPlaceHolderClientConfig config = new JsonPlaceHolderClientConfig();
        config.setServerUrl("https://jsonplaceholder.typicode.com");
        JsonPlaceHolderClient client = new JsonPlaceHolderClient(config);
        User u = client.getUser(1);

        assertEquals("Leanne Graham", u.getName());
        assertEquals("Romaguera-Crona", u.getCompany().getName());
    }
}
