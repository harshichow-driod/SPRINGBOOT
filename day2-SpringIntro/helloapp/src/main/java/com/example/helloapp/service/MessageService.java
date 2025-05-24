package com.example.helloapp.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String getMessage(String name) {
        return "Hello, " + name + "!";
    }
}
