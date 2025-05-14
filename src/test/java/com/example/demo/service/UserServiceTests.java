package com.example.demo.service;

import com.example.demo.repo.FakeRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class UserServiceTests {

    @Mock
    private FakeRepo fakeRepo;

    @InjectMocks
    private UserServiceImpl userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddUser() {
        // Given
        long id = 1;
        String name = "Konanani";
        String surname = "maduguma";

        // When
        userService.addUser(id, name, surname);

        // Then
        verify(fakeRepo, times(1)).insertUser(id, name, surname);
        // In a real test, we'd also capture System.out to verify the message
    }

    @Test
    void testRemoveUser() {
        // Given
        long id = 1;
        String name = "Konanani";
        String surname = "Maduguma";

        // When
        userService.removeUser(id);

        // Then
        verify(fakeRepo, times(1)).deleteUser(id);
    }

    @Test
    void testGetUser() {
        // Given
        long id = 1;
        String name = "Konanani";
        String expectedMessage = "Hello " + name;

        // When
        String result = userService.getUser(id);

        // Then
        assertEquals(expectedMessage, result);
    }
}