package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        Millenials millenials = new Millenials("Brajan");
        YGeneration yGeneration = new YGeneration("Dzesika");
        ZGeneration zGeneration = new ZGeneration("Jeronimo-Martin");

        //When
        String millenialsPost = millenials.sharePost();
        System.out.println("Brajan of the millenials shared post: " + millenialsPost);
        String yGenerationPost = yGeneration.sharePost();
        System.out.println("Dzesika of the YGeneratiom shared post: " + yGenerationPost);
        String zGenerationPost = zGeneration.sharePost();
        System.out.println("Jeronimo-Martin of the ZGeneration shared post: " + zGenerationPost);


        //Then
        Assert.assertEquals("[Millenials] Facebook", millenialsPost);
        Assert.assertEquals("[YGeneration] Twitter", yGenerationPost);
        Assert.assertEquals("[ZGeneration] Snapchat", zGenerationPost);


    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        Millenials millenials = new Millenials("Brajan");

        //When
        String millenialsPost = millenials.sharePost();
        System.out.println("Brajan of the millenials shared post: " + millenialsPost);
        millenials.setSocialPublisher(new TwitterPublisher());
        millenialsPost = millenials.sharePost();
        System.out.println("Brajan of the millenials shared another post: " + millenialsPost);

        //Then
        Assert.assertEquals("[YGeneration] Twitter", millenialsPost);



    }
}

