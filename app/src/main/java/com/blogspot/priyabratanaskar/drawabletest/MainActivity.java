package com.blogspot.priyabratanaskar.drawabletest;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int batteryLevel = 0;
    private ImageView battery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        battery = findViewById(R.id.battery);
    }

    private void setBatteryLevel() {
        battery.setImageLevel(batteryLevel);
    }

    public void decrease(View view) {
        if (batteryLevel > 0) {
            batteryLevel--;
            setBatteryLevel();
        } else {
            Toast.makeText(this, "Battery if Empty", Toast.LENGTH_SHORT).show();
        }
    }

    public void increase(View view) {
        if (batteryLevel < 7) {
            batteryLevel++;
            setBatteryLevel();
        } else {
            Toast.makeText(this, "Battery if Full", Toast.LENGTH_SHORT).show();
        }
    }
}
