package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    final String username;

    public ForumUser(final String username) {
        this.username = "John Smith";
    }
}
