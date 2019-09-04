package com.edmar.mall1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Mall1Application {

    public static void main(String[] args) {
        SpringApplication.run(Mall1Application.class, args);
    }

}
