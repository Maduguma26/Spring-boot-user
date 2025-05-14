package com.example.demo.service;

public interface UserService {
    void addUser(long id, String name, String surname);
    void removeUser(long id);
    String getUser(long id);
}