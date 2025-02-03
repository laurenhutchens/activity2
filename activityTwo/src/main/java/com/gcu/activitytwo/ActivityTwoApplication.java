package com.gcu.activitytwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan({"com.gcu"})
public class ActivityTwoApplication {

    public static void main(String[] args) {

        SpringApplication.run(ActivityTwoApplication.class, args);
    }

}
