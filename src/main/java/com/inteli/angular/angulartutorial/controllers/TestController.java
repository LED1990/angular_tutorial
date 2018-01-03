package com.inteli.angular.angulartutorial.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class TestController {

    private static final Logger LOGGER = Logger.getLogger(TestController.class.getName());

    @RequestMapping("/api/hi")
    public String hi() {
        LOGGER.info("I am inside controller");
        return "I am test home page from rest controller :)";
    }
}
