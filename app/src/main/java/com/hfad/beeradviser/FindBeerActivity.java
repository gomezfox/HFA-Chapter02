package com.hfad.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends Activity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    //Call when the button gets clicked
    public void onClickFindBeer(View view) {
        //Get a reference to the TextView
        TextView brands = (TextView) findViewById(R.id.brands);

        //Get a reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color);

        //Get the selected item in the Spinner
        String beerType = String.valueOf(color.getSelectedItem());

        //TODO: Get recommendations from the BeerExpert class
        //DONE:  Unnecessary here, incorporated into the for loop below

        //TODO: Display the brands instead of the beerType using the BeerExpert class
        //DONE:  Iterate through brandList and build a multiline string
        StringBuilder allBrands = new StringBuilder();
        for (String brandItem:expert.getBrands(beerType))
        {
            allBrands.append(brandItem);
            allBrands.append("\n");
        }

        brands.setText(allBrands);

    }
}
