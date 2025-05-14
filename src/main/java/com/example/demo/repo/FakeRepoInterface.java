package com.example.demo.repo;

import com.example.demo.model.User;

public interface FakeRepoInterface {
    void insertUser(long id, String name, String surname);
    User findUserById(long id);
    void deleteUser(long id);
}