package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button trigger;
        trigger = findViewById(R.id.trigger_button);

        final ImageView ball;
        ball = findViewById(R.id.main_ball);

        final Random rng = new Random();

        final int[] answers = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };


        //functionality
        trigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int seed = rng.nextInt(5);

                ball.setImageResource(answers[seed]);
            }
        });
    }
}
