package com.token.authenticate.service;

import com.token.authenticate.configuration.JwtTokenUtils;
import com.token.authenticate.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Value("${jwt.token.secret}")
    private String secretKey;
    private int expiredTimes = 1000 * 60 * 60;

    public String login(String username, String password) {
        return JwtTokenUtils.createToken(username, secretKey, expiredTimes);
    }

}
