package com.hfad.beeradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidg on 28/04/2017.
 */

public class BeerExpert {

    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else if (color.equals("dark")){
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        } else if (color.equals("light")){
            brands.add("Stella Artois");
            brands.add("Heineken");
        } else if (color.equals("brown")){
            brands.add("Newcastle");
        } else {
            // none (returns empty list)
        }
        return brands;
    }
}
