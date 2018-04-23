package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent europe = new Continent();
        Continent africa = new Continent();
        Continent asia = new Continent();
        world.addContinents( europe );
        world.addContinents( africa );
        world.addContinents( asia );

        Country switzerland = new Country("Switzerland", 10.25d );
        Country luxembourg = new Country( "Luxembourg", 20.55d );
        Country belgium = new Country( "Belgium", 30.25d );

        europe.countries.add(switzerland);
        europe.countries.add(luxembourg);
        europe.countries.add(belgium);

        Country southAfrica = new Country( "South Africa", 40.45d );
        Country ivoryCoast = new Country( "Ivory Coast", 50.50d );
        Country sierraLeone = new Country( "Sierra Leone", 60.60d );

        africa.countries.add(southAfrica);
        africa.countries.add(ivoryCoast);
        africa.countries.add(sierraLeone);

        Country vietnam = new Country( "Vietnam", 60.50d );
        Country laos = new Country( "Laos", 50.60d );
        Country thailand = new Country( "Thailand", 40.40d );

        asia.countries.add( vietnam );
        asia.countries.add( laos );
        asia.countries.add( thailand );

        //When
        double peopleCount =  world.getPeopleQuantity();

        //Then
        Assert.assertEquals( peopleCount, 364.1, 0.001 );



    }
}
