package com.quantly.service;

import com.quantly.dto.UserRegistrationDto;
import com.quantly.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
