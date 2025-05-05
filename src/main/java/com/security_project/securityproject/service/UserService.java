package com.security_project.securityproject.service;

import com.security_project.securityproject.model.User;
import com.security_project.securityproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Autowired
    AuthenticationManager authManager;

    @Autowired
    private JwtService jwtService;


    public User register(User user) {
        user.setPass(encoder.encode(user.getPass()));
        return userRepository.save(user);
    }



    //Verify Token
    public String verify(User user) {

        Authentication authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPass()));

        if(authentication.isAuthenticated()) {
            return jwtService.generateToken(user.getUsername() );
        }
        return "fail";
    }
}
