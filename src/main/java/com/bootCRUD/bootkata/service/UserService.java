package com.bootCRUD.bootkata.service;

import com.bootCRUD.bootkata.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    void removeUserById(Long id);

    List<User> getAllUsers();

    void updateUserById(User user);

    User getUser(Long id);
}
