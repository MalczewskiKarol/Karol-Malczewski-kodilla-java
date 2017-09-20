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
        return numberOfPosts;
    }
//dodalem sam returna w postach i komentarzach
    public int commentsCount() {
        return numberOfComments;
    }

    public int getnumberOfUsers() {
        return numberOfUsers;
    }

    public int getnumberOfPosts() {
        return numberOfPosts;
    }

    public int getnumberOfComments() {
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
        this.averageCommentsPerUser = statistics.postsCount() / statistics.userNames().size();
        this.averageCommentsPerPosts = statistics.commentsCount() / statistics.postsCount();

    }
}