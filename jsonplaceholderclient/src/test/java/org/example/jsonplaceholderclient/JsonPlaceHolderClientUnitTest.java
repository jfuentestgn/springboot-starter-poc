package org.example.jsonplaceholderclient;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonPlaceHolderClientUnitTest {

    @Test
    public void testGetUser() {
        JsonPlaceHolderClient client = new JsonPlaceHolderClient("https://jsonplaceholder.typicode.com");
        User u = client.getUser(1);

        assertEquals("Leanne Graham", u.getName());
        assertEquals("Romaguera-Crona", u.getCompany().getName());
    }
}
