package org.example.jsonplaceholderclient.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("jsonplaceholderclient")
public class JsonPlaceHolderClientProperties {

    private String server;


    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }
}
