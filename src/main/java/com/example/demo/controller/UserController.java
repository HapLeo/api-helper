package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/list")
    public Object list(@RequestParam("dateTime") LocalDateTime dateTime, @RequestParam("date") LocalDate date, @RequestParam("time") LocalTime time) {

        System.out.println(dateTime);
        System.out.println(date);
        System.out.println(time);
        return null;
    }
}
