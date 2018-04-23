package com.kodilla.testing.forum.tdd.statistics;

import com.kodilla.testing.forum.statistics.ForumData;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumDataTestSuite {
    static int testCounter;

    private List<String> generatedUsersList (int usersQuantity){
        List<String> genUsers = new ArrayList<String>();
            for(int n = 1; n <= usersQuantity; n++){
                genUsers.add("User" + n);
            }
        return genUsers;
    }


    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void calculateAdvStatisticsPosts0(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumData forumData = new ForumData(statisticsMock);
        List<String> users = new ArrayList<>();
            users.add("Bolek");
            users.add("Lolek");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(20);

        //When
        forumData.calculateAdvStatistics( statisticsMock );

        //Then
        Assert.assertTrue( forumData.getAvgCommentsOnPosts() == Double.POSITIVE_INFINITY );
    }

    @Test
    public void calculateAdvStatisticsPosts1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumData forumData = new ForumData(statisticsMock);
        List<String> users = new ArrayList<>();
            users.add("Bolek");
            users.add("Lolek");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);

        //When
        forumData.calculateAdvStatistics( statisticsMock );

        //Then
        Assert.assertTrue(forumData.getAvgCommentsOnPosts()== 2);
    }

    @Test
    public void calculateAdvStatisticsComments0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumData forumData = new ForumData(statisticsMock);
        List<String> users = new ArrayList<>();
            users.add("Bolek");
            users.add("Lolek");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumData.calculateAdvStatistics( statisticsMock );

        //Then
        Assert.assertTrue( forumData.getAvgCommentsOnPosts() == forumData.getAvgCommentsOnUser() );
    }

    @Test
    public void calculateAdvStatisticsCommentsLessThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumData forumData = new ForumData(statisticsMock);
        List<String> users = new ArrayList<>();
          users.add("Bolek");
          users.add("Lolek");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(10);

        //When
        forumData.calculateAdvStatistics( statisticsMock );

        //Then
        Assert.assertTrue(statisticsMock.postsCount() > statisticsMock.commentsCount());
    }

    @Test
    public void calculateAdvStatisticsPostsLessThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumData forumData = new ForumData(statisticsMock);
        List<String> users = new ArrayList<>();
            users.add("Bolek");
            users.add("Lolek");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        forumData.calculateAdvStatistics( statisticsMock );

        //Then
        Assert.assertTrue(statisticsMock.postsCount() < statisticsMock.commentsCount());
    }

    @Test
    public void calculateAdvStatisticsUsers0(){
    //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumData forumData = new ForumData(statisticsMock);
        List<String> users = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);

    //When
        forumData.calculateAdvStatistics( statisticsMock );

    //Then
        Assert.assertTrue( (Double) forumData.getAvgCommentsOnUser() == Double.POSITIVE_INFINITY);
    }
    @Test
    public void calculateAdvStatisticsUsers100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumData forumData = new ForumData(statisticsMock);
        List<String> users = generatedUsersList( 100 );

        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(20);

        //When
        forumData.calculateAdvStatistics( statisticsMock );

        //Then
        Assert.assertTrue(forumData.getAvgPostsOnUser() == 1);
    }
}
