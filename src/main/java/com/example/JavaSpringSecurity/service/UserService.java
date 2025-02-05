package com.example.JavaSpringSecurity.service;


import com.example.JavaSpringSecurity.entity.UserEntity;
import com.example.JavaSpringSecurity.enums.Role;
import com.example.JavaSpringSecurity.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public UserEntity createUser(UserEntity user) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        HashSet<String> roles = new HashSet<>();
        roles.add(Role.USER.name());
        user.setRoles(roles);
        return userRepository.save(user);

    }
//    @PreAuthorize("hasRole('ADMIN')")
    public List<UserEntity> getAllUsers() {
//        log.info("in method getAllUsers");
        return userRepository.findAll();
    }
//    @PostAuthorize("returnObject.username == authentication.name")
    public Optional<UserEntity> getUserById(UUID id) {
//        log.info("in method findById");
        return userRepository.findById(id);
    }
    public void DeleteUser(UUID user) {
        userRepository.deleteById(user);
    }
}
