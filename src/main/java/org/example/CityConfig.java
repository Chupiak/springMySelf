package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CityConfig {

    @Bean
    public Electricity electricity() {
        return new Electricity();
    }

    @Bean
    public Water water() {
        return new Water();
    }

    @Bean
    public Industry industry() {
        return new Industry();
    }

    @Bean
    public City city(Electricity electricity, Water water, Industry industry) {
        return new City(electricity,water,industry);
    }
}
