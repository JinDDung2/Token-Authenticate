package com.token.authenticate.controller;

import com.token.authenticate.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class ApiController {

    private final UserService userService;

    @PostMapping("/login")
    public String login() {
        return "요청 완료";
    }

}
