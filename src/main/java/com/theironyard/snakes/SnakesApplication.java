package com.theironyard.snakes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SnakesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnakesApplication.class, args);
    }
}


//	@channel Hey everyone!
//  For today’s daily assignment, write your own CRUD app in Spring using JPA.
//  You may use the Cookies-jar app to get many of your ideas,
//  But try to make it your own.
//  Your site must:
//	1. Have at least one model (like `Cookie`)
//	2. Have at least one repository (like `CookieRepository`)
//	3. Have the ability to Create, Read (e.g. list out), Edit, and
//     Delete your model
//	4. Use Thymeleaf to setup a basic template.