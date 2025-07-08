package com.bookstore.user_service.service;

import com.bookstore.user_service.entity.User;

import java.util.*;

public interface UserService {

    User saveUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
}
