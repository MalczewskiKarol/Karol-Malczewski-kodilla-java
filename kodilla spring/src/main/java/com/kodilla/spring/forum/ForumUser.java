package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    ForumUser forumUser;
    final String username;

    public ForumUser() {
        this.username = "John Smith";
    }
}
