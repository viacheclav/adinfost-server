package com.adinfost.init;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.adinfost")
public class AppConfig {

    @Bean
    public MongoClient mongo() throws Exception {
        return new MongoClient("localhost", 27017);
    }
}
