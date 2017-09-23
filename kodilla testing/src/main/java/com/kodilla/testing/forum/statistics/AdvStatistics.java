package com.kodilla.testing.forum.statistics;

import java.util.*;

public class AdvStatistics implements Statistics {

    int commentsCount;
    int postsCount;
    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPosts;

    public List<String> userNames() {
        return null;
    }

    public int postsCount() {
        if(postsCount() == 0) {
            int postsCount = getNumberOfPosts();
        }
        return getNumberOfPosts();
    }

    public int commentsCount() {
        if(commentsCount() == 0) {
            int commentsCount = getNumberOfComments();
        }
        return getNumberOfComments();
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPosts() {
        return averageCommentsPerPosts;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        this.numberOfUsers = statistics.userNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();
        this.averagePostsPerUser = statistics.postsCount() / statistics.userNames().size();
        this.averageCommentsPerUser = statistics.commentsCount() / statistics.userNames().size();
        this.averageCommentsPerPosts = statistics.commentsCount() / statistics.postsCount();

    }

    public void showStatistics() {
        System.out.println("number of users: " + numberOfUsers);
        System.out.println("number of posts: " + numberOfPosts);
        System.out.println("number of comments: " + numberOfComments);
        System.out.println("average posts/users: " + averagePostsPerUser);
        System.out.println("average comments/users: " + averageCommentsPerUser);
        System.out.println("average comments/posts: " + averageCommentsPerPosts);


    }
}