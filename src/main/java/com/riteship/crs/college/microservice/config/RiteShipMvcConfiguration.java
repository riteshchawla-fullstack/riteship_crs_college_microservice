package com.riteship.crs.college.microservice.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*import org.springframework.session.web.http.DefaultCookieSerializer;*/

@Configuration
public class RiteShipMvcConfiguration {

    /*@Bean
    public DefaultCookieSerializer cookieSerializer() {
        DefaultCookieSerializer serializer = new DefaultCookieSerializer();
        serializer.setUseBase64Encoding(false);
        return serializer;
    }*/

    @Bean
    public ObjectMapper getObjectMapper() {
        return new ObjectMapper();
    }

}