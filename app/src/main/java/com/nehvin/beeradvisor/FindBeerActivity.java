package com.nehvin.beeradvisor;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view)
    {
        BeerExpert expert = new BeerExpert();
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);
        String beertype = String.valueOf(color.getSelectedItem());
        brands.setText(beertype);
        List<String> brandList = expert.getBrands(beertype);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandList)
        {
            brandsFormatted.append(brand).append('\n');
        }
        brands.setText(brandsFormatted);
    }
}