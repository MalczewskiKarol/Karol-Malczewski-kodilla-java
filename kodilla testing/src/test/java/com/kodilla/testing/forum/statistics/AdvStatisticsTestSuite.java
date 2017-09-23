package com.kodilla.testing.forum.statistics;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class AdvStatisticsTestSuite {
    public static int testCounter = 0;

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Test #" + testCounter);
    }

    @After
    public void afterEveryTest() {
        System.out.println("=============================");
    }

    @Test
    public void testCalculateZeroPosts() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userNames = new ArrayList<>();
        userNames.add("user");
        userNames.add("user1");
        userNames.add("user2");
        userNames.add("user3");
        userNames.add("user4");

        int postsNumber = 0;
        int commentsNumber = 655;

        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);

        AdvStatistics advStatistics = new AdvStatistics();

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        double postsPerUser = advStatistics.getAveragePostsPerUser();
        double commentsPerUser = advStatistics.getAverageCommentsPerUser();
        double commentsPerPost = advStatistics.getAverageCommentsPerPosts();

        //Then
        Assert.assertEquals(0, postsPerUser, 0);
        Assert.assertEquals(131, commentsPerUser, 0);
        Assert.assertEquals(0, commentsPerPost, 0);
        advStatistics.showStatistics();

    }

    @Test
    public void testCalculateThousandPosts() {

        //Given
       Statistics statisticsMock = mock(Statistics.class);

       List<String> userNames = new ArrayList<>();
       userNames.add("user");
        userNames.add("user1");
        userNames.add("user2");
        userNames.add("user3");
        userNames.add("user4");

       int postsNumber = 1000;
       int commentsNumber = 5000;


        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);

        AdvStatistics advStatistics = new AdvStatistics();

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        double postsPerUser = advStatistics.getAveragePostsPerUser();
        double commentsPerUser = advStatistics.getAverageCommentsPerUser();
        double commentsPerPost = advStatistics.getAverageCommentsPerPosts();
        //Then
        Assert.assertEquals(200, postsPerUser, 0);
        Assert.assertEquals(1000, commentsPerUser, 0);
        Assert.assertEquals(5, commentsPerPost, 0);
        advStatistics.showStatistics();
    }

    @Test
    public void testCalculateZeroComments() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userNames = new ArrayList<>();
        userNames.add("user");
        userNames.add("user1");
        userNames.add("user2");
        userNames.add("user3");
        userNames.add("user4");
        userNames.add("user5");
        userNames.add("user6");

        int postsNumber = 1000;
        int commentsNumber = 0;


        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);

        AdvStatistics advStatistics = new AdvStatistics();

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        double postsPerUser = advStatistics.getAveragePostsPerUser();
        double commentsPerUser = advStatistics.getAverageCommentsPerUser();
        double commentsPerPost = advStatistics.getAverageCommentsPerPosts();

        //Then
        Assert.assertEquals(142, postsPerUser, 0);
        Assert.assertEquals(0, commentsPerUser, 0);
        Assert.assertEquals(0, commentsPerPost, 0);
        advStatistics.showStatistics();
    }

    @Test
    public void testCalculateCommentsLowerThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userNames = new ArrayList<>();
        userNames.add("user");
        userNames.add("user1");
        userNames.add("user2");
        userNames.add("user3");
        userNames.add("user4");
        userNames.add("user5");
        userNames.add("user6");

        final int postsNumber = 500;
        final int commentsNumber = 70;


        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);

        AdvStatistics advStatistics = new AdvStatistics();

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        double postsPerUser = advStatistics.getAveragePostsPerUser();
        double commentsPerUser = advStatistics.getAverageCommentsPerUser();
        double commentsPerPost = advStatistics.getAverageCommentsPerPosts();

        //Then
        Assert.assertEquals(71, postsPerUser, 0);
        Assert.assertEquals(10, commentsPerUser, 0);
        Assert.assertEquals(0, commentsPerPost, 0);
        advStatistics.showStatistics();
    }

    @Test
    public void testCalculateCommentsHigherThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userNames = new ArrayList<>();
        userNames.add("user");
        userNames.add("user1");
        userNames.add("user2");
        userNames.add("user3");
        userNames.add("user4");
        userNames.add("user5");
        userNames.add("user6");

        int postsNumber = 350;
        int commentsNumber = 700;


        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);

        AdvStatistics advStatistics = new AdvStatistics();

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        double postsPerUser = advStatistics.getAveragePostsPerUser();
        double commentsPerUser = advStatistics.getAverageCommentsPerUser();
        double commentsPerPost = advStatistics.getAverageCommentsPerPosts();

        //Then
        Assert.assertEquals(50, postsPerUser, 0);
        Assert.assertEquals(100, commentsPerUser, 0);
        Assert.assertEquals(2, commentsPerPost, 0);
        advStatistics.showStatistics();
    }

    @Test
    public void testCalculateZeroUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userNames = new ArrayList<>();
        userNames.clear();

        int postsNumber = 54;
        int commentsNumber = 753;


        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);

        AdvStatistics advStatistics = new AdvStatistics();

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        double postsPerUser = advStatistics.getAveragePostsPerUser();
        double commentsPerUser = advStatistics.getAverageCommentsPerUser();
        double commentsPerPost = advStatistics.getAverageCommentsPerPosts();

        //Then
        Assert.assertEquals(0, postsPerUser, 0);
        Assert.assertEquals(0, commentsPerUser, 0);
        Assert.assertEquals(13, commentsPerPost, 0);
        advStatistics.showStatistics();
    }

    @Test
    public void testCalculateHundredUsers() {
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userNames = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            userNames.add("user");
        }

        int postsNumber = 350;
        int commentsNumber = 700;


        when(statisticsMock.userNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);

        AdvStatistics advStatistics = new AdvStatistics();

        //When
        advStatistics.calculateAdvStatistics(statisticsMock);
        double postsPerUser = advStatistics.getAveragePostsPerUser();
        double commentsPerUser = advStatistics.getAverageCommentsPerUser();
        double commentsPerPost = advStatistics.getAverageCommentsPerPosts();

        //Then
        Assert.assertEquals(3, postsPerUser, 0);
        Assert.assertEquals(7, commentsPerUser, 0);
        Assert.assertEquals(2, commentsPerPost, 0);
        advStatistics.showStatistics();
    }
}