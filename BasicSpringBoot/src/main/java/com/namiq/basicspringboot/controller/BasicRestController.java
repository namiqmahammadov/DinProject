package com.namiq.basicspringboot.controller;

import com.namiq.basicspringboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicRestController {
    @Autowired
    private HelloService helloService;
}
