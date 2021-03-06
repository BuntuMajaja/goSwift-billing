package com.swiftwayz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.swiftwayz")
@EntityScan(basePackages = {"com.swiftwayz.domain"})
@EnableJpaRepositories(basePackages = {"com.swiftwayz.repository"})
public class GoSwiftApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoSwiftApplication.class, args);
    }
}
