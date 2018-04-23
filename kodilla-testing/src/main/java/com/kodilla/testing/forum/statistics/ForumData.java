package com.kodilla.testing.forum.statistics;

import java.util.Objects;

public class ForumData {
    private Statistics statistics;
    private double usersCount;
    private double postsCount;
    private double commentsCount;
    private double avgPostsOnUser;
    private double avgCommentsOnUser;
    private double avgCommentsOnPosts;

    public ForumData(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        this.usersCount = statistics.usersNames().size();
        this.postsCount = statistics.postsCount();
        this.commentsCount = statistics.commentsCount();
        this.avgPostsOnUser = (postsCount) / (usersCount);
        this.avgCommentsOnUser = (commentsCount) / (usersCount);
        this.avgCommentsOnPosts = (commentsCount) / (postsCount);

    }

    public void ShowStatistics(){
        System.out.println( "Total users count: " + this.usersCount + "\n" +
                            "Total posts count: " + this.postsCount + "\n" +
                            "Total comments count: " + this.commentsCount + "\n" +
                            "Average posts per user: " + this.avgPostsOnUser + "\n" +
                            "Average Comments per user: " + this.avgCommentsOnUser + "\n" +
                            "Average Comments per post: " + this.avgCommentsOnPosts + "\n");
    }

    public double getUsersCount() {
        return usersCount;
    }

    public double getPostsCount() {
        return postsCount;
    }

    public double getCommentsCount() {
        return commentsCount;
    }

    public double getAvgPostsOnUser() {
        return avgPostsOnUser;
    }

    public double getAvgCommentsOnUser() {
        return avgCommentsOnUser;
    }

    public double getAvgCommentsOnPosts() {
        return avgCommentsOnPosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumData forumData = (ForumData) o;
        return Objects.equals( statistics, forumData.statistics );
    }

    @Override
    public int hashCode() {

        return Objects.hash( statistics );
    }

    @Override
    public String toString() {
        return "ForumData{" +
                "statistics=" + statistics +
                '}';
    }
}
