package com.kodilla.testing.forum.statistics;

import java.util.*;

public class AdvStatistics implements Statistics {

    public int postsCount() {
        return  postsCount;
    }
    public int commentsCount() {
        return commentsCount;
    }
    int commentsCount;
    int postsCount;
    int userNamesCount;
    double resultUsersPosts;
    double resultCommentsUsers;
    double resultCommentsPosts;


    List<String> userNames = new ArrayList<String>();

    public List<String> userNames() {
        return userNames;
    }

    Statistics statistics;

    public AdvStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        userNamesCount = statistics.userNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        resultUsersPosts = postsCount / userNamesCount;
        resultCommentsUsers = statistics.commentsCount() / userNamesCount;
        resultCommentsPosts = statistics.commentsCount() / postsCount;
    }

//    public void showStatistics() {
//        System.out.println(resultUsersPosts);
//        System.out.println(resultCommentsUsers);
//        System.out.println(resultCommentsPosts);
//    }

}