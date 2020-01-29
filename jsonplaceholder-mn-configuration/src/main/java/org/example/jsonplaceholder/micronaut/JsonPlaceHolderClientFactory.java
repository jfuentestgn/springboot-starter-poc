package org.example.jsonplaceholder.micronaut;

import io.micronaut.context.annotation.Factory;
import org.example.jsonplaceholderclient.JsonPlaceHolderClient;
import org.example.jsonplaceholderclient.JsonPlaceHolderClientConfig;

import javax.inject.Singleton;

@Factory
public class JsonPlaceHolderClientFactory {

    @Singleton
    public JsonPlaceHolderClientConfig jsonPlaceHolderClientConfig(JsonPlaceHolderConfiguration jsonPlaceHolderConfiguration) {
        JsonPlaceHolderClientConfig jsonPlaceHolderClientConfig = new JsonPlaceHolderClientConfig();
        jsonPlaceHolderClientConfig.setServerUrl(jsonPlaceHolderConfiguration.getServer());
        return jsonPlaceHolderClientConfig;
    }

    @Singleton
    public JsonPlaceHolderClient jsonPlaceHolderClient(JsonPlaceHolderClientConfig jsonPlaceHolderClientConfig) {
        return new JsonPlaceHolderClient(jsonPlaceHolderClientConfig);
    }
}
