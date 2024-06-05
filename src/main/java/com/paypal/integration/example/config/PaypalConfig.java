package com.paypal.integration.example.config;


import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.OAuthTokenCredential;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class PaypalConfig {

    @Value("${paypal.client-id}")
    private String clientID;

    @Value("${paypal.client-secret}")
    private String clientSecret;

    @Value("${paypal.mode}")
    private String mode;

    @Bean
    public APIContext apiContext(){
        return new APIContext(clientID, clientSecret, mode);
    }

//    public Map<String, String> paypalConfig(){
//        Map<String, String> configMap = new HashMap<>();
//        configMap.put("mode", mode);
//        return configMap;
//    }
//
//    @Bean
//    public OAuthTokenCredential oAuthTokenCredential(){
//        return new OAuthTokenCredential(clientID, clientSecret, paypalConfig());
//    }
}
