package ru.konoplin.dao;

import ru.konoplin.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    void createUser(User user);

    User readUser(Long id);

    void updateUser(User user);

    User deleteUser(Long id);
}