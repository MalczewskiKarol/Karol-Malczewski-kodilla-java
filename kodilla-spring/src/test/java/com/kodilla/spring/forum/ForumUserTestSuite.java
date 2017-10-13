package com.kodilla.spring.forum;

import javafx.application.Application;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ForumUserTestSuite {
    @Test
    public void testGetUsername() {
        //Given
        ApplicationContext bean = new AnnotationConfigApplicationContext("John Smith");
        ForumUser forumUser = bean.getBean(ForumUser.class);
        //When
        String username = forumUser.username;
        //Then
        Assert.assertEquals("John Smith", username);
    }
}
