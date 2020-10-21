package com.example.tardis.coolweather;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "S-a apelat onCreate", Toast.LENGTH_LONG).show();

        @SuppressLint("WrongViewCast") Button addLocationButton = findViewById(R.id.add_location_button);
        addLocationButton.setOnClickListener(new View.OnClickListener() {
                                                 @Override
                                                 public void onClick(View v) {
                                                     Intent intentExplicit = new Intent(MainActivity.this, addLocationActivity.class);
                                                     intentExplicit.putExtra("country", "Romania");
                                                     startActivity(intentExplicit);
                                                 }

                                             }
        );
    }

    private void show() {
    }
    public void deschideBrowser(View view){
        Intent intentImplicit =
                new Intent(Intent.ACTION_VIEW, Uri.parse("http://accuweather.com"));
                startActivity(intentImplicit);
    }
}
