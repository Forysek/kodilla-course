package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    public final List<Country> countries = new ArrayList<>();


    public void addCountriesToContinent(Country country){
        countries.add(country);
    }

    public List<Country> getCountriesList(){
        return new ArrayList<>(countries);
    }

}
