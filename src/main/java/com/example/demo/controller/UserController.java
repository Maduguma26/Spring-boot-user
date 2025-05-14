package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public String addUser(@RequestParam long id,
                          @RequestParam String name,
                          @RequestParam String surname) {
        userService.addUser(id, name, surname);
        return name + " added successfully";
    }

    @GetMapping("/get/{id}")
    public String getUser(@PathVariable long id) {
        return userService.getUser(id);
    }

    @DeleteMapping("/remove/{id}")
    public String removeUser(@PathVariable long id) {
        userService.removeUser(id);
        return "User with ID " + id + " removed";
    }
}