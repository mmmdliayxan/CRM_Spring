package org.example.crm_spring.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.crm_spring.entity.User;
import org.example.crm_spring.repository.UserRepository;
import org.example.crm_spring.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public String loginUser(User user) {
        Optional<User> userData =  userRepository.findByEmail(user.getEmail());
        if(user.getPassword().equals(userData.orElseThrow(()->{
            log.error("error");
            return new RuntimeException("error");
        }).getPassword())){
            return "customerRegister";
        }
        return "redirect:/";
    }

    @Override
    public String loadRegister(User user) {
        userRepository.save(user);
        return "redirect:/";
    }
}
