package com.example.demo.Controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class personDetails {
    @GetMapping ("/name/{id}")
    public ResponseEntity<String> getUserDetails(@PathVariable("id") String id){
        if(id.equals("1")){
            return new ResponseEntity<>("User Found", HttpStatusCode.valueOf(200));
        }
        throw new RuntimeException();
    }
}
