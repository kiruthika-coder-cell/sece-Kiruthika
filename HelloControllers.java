package com.sece.eceb.controllers;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
 public class HelloControllers {
    @GetMapping("/")
    public String helloworld(@RequestParam(name="name",defaultValue ="world") String name)
    {
        return "Hello World " + name;

    }
     @PostMapping("/")
    public String helloworldPost(@RequestParam(name="name",defaultValue ="world") String name)
    {
        return "Hello World " + name;

    }

}

