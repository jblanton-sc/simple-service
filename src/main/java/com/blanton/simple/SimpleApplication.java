package com.blanton.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleApplication {

    //direct spring to run (starts up a Tomcat instance in the background by default)
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SimpleApplication.class, args);
    }

}
