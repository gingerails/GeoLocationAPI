package com.genpt.nsight.geolocationapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class GeoLocationApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeoLocationApiApplication.class, args);
    }

}
