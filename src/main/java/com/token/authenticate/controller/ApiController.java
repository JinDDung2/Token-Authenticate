package com.token.authenticate.controller;

import com.token.authenticate.service.ReviewService;
import com.token.authenticate.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
public class ApiController {

    private final ReviewService reviewService;
    private final UserService userService;

    @PostMapping("/login")
    public ResponseEntity<String> login(String username, String password) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.login(username, password));
    }

    @PostMapping("/reviews")
    public ResponseEntity<String> reviews() {
        return ResponseEntity.status(HttpStatus.OK).body(reviewService.createReview());
    }

}
