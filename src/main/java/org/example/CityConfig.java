package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CityConfig {

    @Bean
    public Electricity electricity() {
        return new Electricity("Kievenergo");
    }

    @Bean
    public Water water() {
        return new Water("Kievvodokanal");
    }

    @Bean
    public Industry industry() {
        return new Industry("It-industry");
    }

    @Bean
    public City city() {
        return new City();
    }
}
