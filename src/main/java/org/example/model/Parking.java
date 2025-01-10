package org.example.model;

import java.util.HashMap;
import java.util.Map;

public class Parking {
    private Map<Integer, Place> places;

    public Parking(int numberOfPlaces) {
        if (numberOfPlaces <= 0) {
            throw new IllegalArgumentException("Le parking doit avoir au moins une place.");
        }
        places = new HashMap<>();
        for (int i = 1; i <= numberOfPlaces; i++) {
            places.put(i, new Place(i));
        }
    }

    public int getFreePlaces(){

        return places.size();
    }

}