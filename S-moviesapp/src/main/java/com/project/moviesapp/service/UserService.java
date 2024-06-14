package com.project.moviesapp.service;

import com.project.moviesapp.model.Users;

import java.util.List;

public interface UserService {
    Users saveUser(Users U);
    List<Users> getAllUsers();
    Users getUserById(int id);
}
