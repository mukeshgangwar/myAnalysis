package com.stock.analysis.MyAnalysis.service;

import org.springframework.stereotype.Service;

import com.stock.analysis.MyAnalysis.dao.UserRepository;
import com.stock.analysis.MyAnalysis.dto.User;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
