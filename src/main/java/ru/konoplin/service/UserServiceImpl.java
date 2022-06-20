package ru.konoplin.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.konoplin.dao.UserDAO;
import ru.konoplin.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public Object readUser(Long id) {
        return userDAO.readUser(id);
    }

    @Override
    public void createOrUpdateUser(User user) {
        userDAO.createUser(user);
    }

    private void createUser(User user) {
        userDAO.createUser(user);
    }

    private void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDAO.deleteUser(id);
    }
}