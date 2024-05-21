package org.example.crm_spring.service;

import org.example.crm_spring.entity.User;

public interface UserService {
    String loginUser(User user);

    String loadRegister(User user);
}
