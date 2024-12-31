package com.example.trafficlights;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView trafficLight;
    private int currentLightState = 0;
    private int[] lightImages = {
            R.drawable.red_light,
            R.drawable.yellow_light,
            R.drawable.green_light
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trafficLight = findViewById(R.id.trafficLight);
        Button changeButton = findViewById(R.id.changeButton);

        changeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentLightState = (currentLightState + 1) % 3;
                trafficLight.setImageResource(lightImages[currentLightState]);
            }
        });
    }
}
