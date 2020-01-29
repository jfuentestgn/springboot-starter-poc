package org.example.jsonplaceholder.micronaut;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("jsonplaceholderclient")
public class JsonPlaceHolderConfiguration {

    private String server;

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }
}
