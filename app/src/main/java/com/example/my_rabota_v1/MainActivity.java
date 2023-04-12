package com.example.my_rabota_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("myTest", "1 активность" + this);

    Button ButtonAnimals = findViewById(R.id.Animals);
    Button ButtonBirds = findViewById(R.id.Birds);
    Button Buttonfish = findViewById(R.id.fish);

       ButtonAnimals.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Menu_Kniga.class);
            startActivity(intent);
        }
    });
        ButtonBirds.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Birds.class);
            startActivity(intent);
        }
    });
        Buttonfish.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Fish.class);
            startActivity(intent);
        }
       });
    }
}