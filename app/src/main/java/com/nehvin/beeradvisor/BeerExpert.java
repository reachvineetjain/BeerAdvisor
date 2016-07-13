package com.nehvin.beeradvisor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vineet K Jain on 7/12/2016.
 */
public class BeerExpert {

    List<String> getBrands ( String color )
    {
        List<String> brands = new ArrayList<String>();
        if (color.equalsIgnoreCase("Amber"))
        {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }
        else if (color.equalsIgnoreCase("Light"))
        {
            brands.add("Carona");
            brands.add("Stella");
        }
        else if (color.equalsIgnoreCase("Brown"))
        {
            brands.add("Budweiser");
            brands.add("Fosters");
        }
        else if (color.equalsIgnoreCase("Dark"))
        {
            brands.add("Heniken");
            brands.add("Kingfisher");
        }
        else
        {
            brands.add("Invalid Option");
        }
        return brands;
    }
}