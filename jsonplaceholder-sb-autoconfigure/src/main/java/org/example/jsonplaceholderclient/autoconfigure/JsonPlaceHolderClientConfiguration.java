package org.example.jsonplaceholderclient.autoconfigure;

import org.example.jsonplaceholderclient.JsonPlaceHolderClient;
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
    public JsonPlaceHolderClient jsonPlaceHolderClient(JsonPlaceHolderClientProperties jsonPlaceHolderClientProperties) {
        return new JsonPlaceHolderClient(jsonPlaceHolderClientProperties.getServer());
    }
}
