package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Continent> continents = new ArrayList<>();

    public void addContinents(Continent continent){
        continents.add(continent);
    }

    public List<Continent> getContinentsList(){
        return new ArrayList<>( continents );
    }

    public double getPeopleQuantity(){

        double totalPeopleQuantity =  continents.stream()
                .flatMap( continents -> continents.getCountriesList().stream() )
                .map( Country::getPeopleQuantity )
                .reduce( 0.0 , (sum, current) -> sum = sum + current );

        return totalPeopleQuantity;
    }

}
