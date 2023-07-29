package com.example.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot1Application
{

    public static void main(String[] args)
    {
        System.out.println("Application started");
        SpringApplication.run(SpringBoot1Application.class, args);
        System.out.println("Server Started....");
    }

}
