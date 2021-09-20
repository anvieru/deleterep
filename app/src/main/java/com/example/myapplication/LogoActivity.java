package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;

public class LogoActivity extends AppCompatActivity {

    ImageView imageView;
    Button btnenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logolayout);

        imageView=findViewById(R.id.imageView);
        btnenter = findViewById(R.id.button);

        Animation animation = AnimationUtils.loadAnimation
                (LogoActivity.this, R.anim.alpha);
        imageView.startAnimation(animation);

        Thread thread = new Thread(){

            public void run(){
                try {
                    TimeUnit.SECONDS.sleep(1);
                    Intent intent = new Intent
                            (LogoActivity.this,
                                    NewClass.class);
                    startActivity(intent);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };thread.start();
    }
}
