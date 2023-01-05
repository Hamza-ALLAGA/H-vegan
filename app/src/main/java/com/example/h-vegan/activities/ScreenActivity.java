package com.example.Hvegan.activities;

import androidx.appcompat.app.AppCompatActivity;
import com.example.Hvegan.R;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

public class ScreenActivity extends AppCompatActivity {

    private static int DELAY_TIME = 4000;

    Animation topAnim, bottomAnim;
    ImageView imageView,imageView33;
    TextView app_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);



        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

       // topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        //bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

       // imageView = findViewById(R.id.imageView2);
        //app_name = findViewById(R.id.app_name);
        //imageView33 =findViewById(R.id.imageView3);

        //imageView.setAnimation(topAnim);
        //app_name.setAnimation(bottomAnim);
        //imageView33.setAnimation(topAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(ScreenActivity.this,Screen1Activity.class);
                startActivity(i);
                finish();

            }
        }
        ,DELAY_TIME);
    }
    }

