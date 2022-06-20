package ru.konoplin.service;

import ru.konoplin.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    Object readUser(Long id);

    void createOrUpdateUser(User user);

    void deleteUser(Long id);

}