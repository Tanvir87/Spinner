package com.smartlocation.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
public class MainActivity extends AppCompatActivity {

    private String[] cars = {"Ferrari","Lamborghini","Rolls Roys"};
    private Spinner spCars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spCars = findViewById(R.id.spCars);
        spCars.setAdapter(new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,cars));

    }
}