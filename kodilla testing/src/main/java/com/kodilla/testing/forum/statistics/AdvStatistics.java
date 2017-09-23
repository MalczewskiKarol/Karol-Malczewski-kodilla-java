package com.kodilla.testing.forum.statistics;

import java.util.*;

public class AdvStatistics implements Statistics {

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
        return 0;
    }

    public int commentsCount() {
        return 0;
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

        if(numberOfUsers > 0) {

            this.averagePostsPerUser = statistics.postsCount() / statistics.userNames().size();
            this.averageCommentsPerUser = statistics.commentsCount() / statistics.userNames().size();

        } else {

            this.averagePostsPerUser = 0;
            this.averageCommentsPerUser = 0;
        }

        if(numberOfPosts > 0) {

            this.averageCommentsPerPosts = statistics.commentsCount() / statistics.postsCount();

        } else {

            this.averageCommentsPerPosts = 0;
        }
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