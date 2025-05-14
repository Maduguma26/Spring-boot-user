package com.example.demo.repo;

import com.example.demo.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class FakeRepo implements FakeRepoInterface {
    // Our in-memory "database"
    private User[] users = new User[10];
    private int userCount = 0;

    @Override
    public void insertUser(long id, String name, String surname) {
        if (userCount < users.length) {
            users[userCount++] = new User(id, name, surname);
        } else {
            // In a real app, we'd handle this properly
            System.out.println("Database full!");
        }
    }

    @Override
    public User findUserById(long id) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getId() == id) {
                return users[i];
            }
        }
        return null;
    }

    @Override
    public void deleteUser(long id) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getId() == id) {
                // Shift remaining elements left
                System.arraycopy(users, i + 1, users, i, userCount - i - 1);
                userCount--;
                users[userCount] = null; // Clear last reference
                break;
            }
        }
    }
}