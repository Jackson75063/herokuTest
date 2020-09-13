package ua.jackson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

    @GetMapping
    public String hello(){
        return "Hello user";
    }
    
     @GetMapping
    public String hello2(){
        return "Hello user2";
    }

}

