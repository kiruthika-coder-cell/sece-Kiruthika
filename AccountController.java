package com.sece.eceb.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController 
public class AccountController{

    //1)Hello World
    //whenever you are getting data from the server, you use GET method
@GetMapping("/")
public String helloWorld() {
    return "Hello World";
}
}


