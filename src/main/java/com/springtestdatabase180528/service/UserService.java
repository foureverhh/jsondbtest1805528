package com.springtestdatabase180528.service;

import com.springtestdatabase180528.domain.User;
import com.springtestdatabase180528.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user){
        return userRepository.save(user);
    }
    public Iterable<User> save(List<User> users){
        return userRepository.save(users);
    }

    public Iterable<User> list(){
        return userRepository.findAll();
    }
}
