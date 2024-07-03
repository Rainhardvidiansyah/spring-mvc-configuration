package com.fundamental.spring.repository;

import com.fundamental.spring.user.Users;

import java.util.Optional;

public interface UserRepository {

    Users saveUser(Users user);
    Users findUserByEmail(String email);
    Optional<Users> findById(int id);


}
