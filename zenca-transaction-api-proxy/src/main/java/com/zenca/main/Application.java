package com.zenca.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "com.zenca.controller"} )
@SpringBootApplication
public class Application {
    public static void main(String arg[]){
        SpringApplication.run(Application.class, arg);
    }
}