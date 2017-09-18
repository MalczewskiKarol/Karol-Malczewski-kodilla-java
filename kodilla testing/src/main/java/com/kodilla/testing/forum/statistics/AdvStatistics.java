package com.kodilla.testing.forum.statistics;

import java.util.*;

public class AdvStatistics implements Statistics {

    Statistics statistics;
    public AdvStatistics calculateAdvStatistics;

    public AdvStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

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

    public void calculateAdvStatistics(Statistics statistics) {

        int userNamesCount = statistics.userNames().size();
        int postsCount = statistics.postsCount();
        int commentsCount = statistics.commentsCount();
        int resultUsersPosts = postsCount / userNamesCount;
        int resultCommentsUsers = statistics.commentsCount() / userNamesCount;
        int resultCommentsPosts = statistics.commentsCount() / postsCount;
    }

//    public void showStatistics() {
//        System.out.println(resultUsersPosts);
//        System.out.println(resultCommentsUsers);
//        System.out.println(resultCommentsPosts);
//    }

}