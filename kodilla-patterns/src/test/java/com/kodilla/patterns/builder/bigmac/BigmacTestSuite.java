package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("sesame")
                .burgers(3)
                .sauce("barbecue")
                .ingredients("cheese")
                .ingredients("pickle")
                .ingredients("bacon")
                .ingredients("chili")
                .build();
        System.out.println(bigmac);

        //When
        int ingredientsCount = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(4, ingredientsCount);
    }
}
