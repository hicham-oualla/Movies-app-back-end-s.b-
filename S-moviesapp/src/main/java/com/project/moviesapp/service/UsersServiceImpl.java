package com.project.moviesapp.service;

import com.project.moviesapp.model.Users;
import com.project.moviesapp.repository.UserRepository;
import com.project.moviesapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Users saveUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public List<Users> getAllUsers() {
        return (List<Users>) userRepository.findAll();
    }

    @Override
    public Users getUserById(int id) {
        Optional<Users> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);
    }
}
