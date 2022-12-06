package com.token.authenticate.service;

import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    public String createReview(String username) {
        return username + "님의 리뷰 작성 완료";
    }

}
