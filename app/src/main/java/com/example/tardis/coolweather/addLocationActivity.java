package com.example.tardis.coolweather;

import android.app.Dialog;
import android.content.Intent;
import android.location.Location;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class addLocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        public void addLocation (View view){
        EditText cityEditText = findViewById(R.id.cityEditText;
        EditText countryEditText = findViewById(R.id.countryEditText);
        if (cityEditText.getText().toString().equals("")){
            AlertDialog.Builder builder = new AlertDialog.Builder( this);
            builder.setTitle(R.string.error);
            builder.setMessage("Localitatea si tara sunt obligatorii!");
            Dialog dialog = builder.create();
            dialog.show();
        }
        else{
            Location location = new Location();
            location.city = cityEditText.getText().toString();
            location.country = countryEditText.getText().toString();
        }

        };
};
