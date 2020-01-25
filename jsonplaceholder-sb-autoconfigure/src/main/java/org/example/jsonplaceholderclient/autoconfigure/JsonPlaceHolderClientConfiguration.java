package org.example.jsonplaceholderclient.autoconfigure;

import org.example.jsonplaceholderclient.JsonPlaceHolderClient;
import org.example.jsonplaceholderclient.JsonPlaceHolderClientConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(JsonPlaceHolderClient.class)
@EnableConfigurationProperties(JsonPlaceHolderClientProperties.class)
public class JsonPlaceHolderClientConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public JsonPlaceHolderClientConfig jsonPlaceHolderClientConfig(JsonPlaceHolderClientProperties jsonPlaceHolderClientProperties) {
        JsonPlaceHolderClientConfig config = new JsonPlaceHolderClientConfig();
        config.setServerUrl(jsonPlaceHolderClientProperties.getServer());
        return config;
    }

    @Bean
    @ConditionalOnMissingBean
    public JsonPlaceHolderClient jsonPlaceHolderClient(JsonPlaceHolderClientConfig jsonPlaceHolderClientConfig) {
        return new JsonPlaceHolderClient(jsonPlaceHolderClientConfig);
    }
}
