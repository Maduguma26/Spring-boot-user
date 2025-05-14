package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repo.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final FakeRepo fakeRepo;

    @Autowired
    public UserServiceImpl(FakeRepo fakeRepo) {
        this.fakeRepo = fakeRepo;
    }

    @Override
    public void addUser(long id, String name, String surname) {
        fakeRepo.insertUser(id, name, surname);
        System.out.println(name + " added");
    }

    @Override
    public void removeUser(long id) {
        User user = fakeRepo.findUserById(id);
        if (user != null) {
            fakeRepo.deleteUser(id);
            System.out.println(user.getName() + " removed");
        }
    }

    @Override
    public String getUser(long id) {
        User user = fakeRepo.findUserById(id);
        if (user != null) {
            String message = "Hello " + user.getName();
            System.out.println(message);
            return message;
        }
        return "User not found";
    }
}