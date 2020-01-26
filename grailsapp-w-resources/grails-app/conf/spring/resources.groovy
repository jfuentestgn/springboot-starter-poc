import org.example.jsonplaceholderclient.JsonPlaceHolderClient
import org.example.jsonplaceholderclient.JsonPlaceHolderClientConfig

// Place your Spring DSL code here
beans = {
    String jsonPlaceHolderClientServerURL = application.config.jsonplaceholderclient.server

    jsonPlaceHolderClientConfig(JsonPlaceHolderClientConfig) {
        serverUrl = jsonPlaceHolderClientServerURL
    }
    jsonPlaceHolderClient(JsonPlaceHolderClient, jsonPlaceHolderClientConfig)
}
