package org.medamine.service;

import org.medamine.model.User;
import org.medamine.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    // Constructor-based injection
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void save(User user) {
        userRepository.save(user);
    }

    public void deleteById(long id) {
        userRepository.deleteById(id);
    }
}
