package ru.kata.spring.boot_security.demo.repository;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;


public interface UserDao {
    void saveUser(User user);
    User getUserById(long id);
    User getUserByUsername(String username);

    void updateUser(User user);

    List<User> getAllUsers();

    void deleteUserById(long id);
}
