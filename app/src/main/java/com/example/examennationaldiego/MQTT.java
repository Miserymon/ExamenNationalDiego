package com.example.examennationaldiego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MQTT extends AppCompatActivity {

    Button btncomback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mqtt);

        btncomback = findViewById(R.id.btn_comeback);
        btncomback.setOnClickListener(view -> {
            Intent intent = new Intent(MQTT.this, Menu.class);
            startActivity(intent);
        });


    }
}