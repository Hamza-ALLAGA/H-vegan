package com.example.Hvegan.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.Hvegan.R;

public class Screen1Activity extends AppCompatActivity {
    private static int DELAY_TIME = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);

        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {

                                          Intent i = new Intent(Screen1Activity.this,LoginActivity.class);
                                          startActivity(i);
                                          finish();

                                      }
                                  }
                ,DELAY_TIME);
    }
}