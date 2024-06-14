package com.project.moviesapp.repository;

import com.project.moviesapp.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Integer> {
}