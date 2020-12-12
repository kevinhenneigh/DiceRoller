package com.ebookfrenzy.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button rollDiceButton;
    private ImageView imageDie1;
    private ImageView imageDie2;
    private ImageView imageDie3;
    private ImageView imageDie4;
    private ImageView imageDie5;
    private ImageView imageDie6;
    private final Random randomNumberGenerator = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollDiceButton = findViewById(R.id.rollDiceButton);
        rollDiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDie1();
                rollDie2();
                rollDie3();
                rollDie4();
                rollDie5();
                rollDie6();
            }
        });

        imageDie1 = findViewById(R.id.image_die1);
        imageDie1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDie1();
            }
        });

        imageDie2 = findViewById(R.id.image_die2);
        imageDie2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDie2();
            }
        });

        imageDie3 = findViewById(R.id.image_die3);
        imageDie3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDie3();
            }
        });

        imageDie4 = findViewById(R.id.image_die4);
        imageDie4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDie4();
            }
        });

        imageDie5 = findViewById(R.id.image_die5);
        imageDie5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDie5();
            }
        });

        imageDie6 = findViewById(R.id.image_die6);
        imageDie6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDie6();
            }
        });
    }

    private void rollDie1() {
        int randomNumber = randomNumberGenerator.nextInt(6) + 1;

        switch (randomNumber) {
            case 1:
                imageDie1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageDie1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageDie1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageDie1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageDie1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageDie1.setImageResource(R.drawable.dice6);
                break;
        }
    }
    private void rollDie2() {
        int randomNumber = randomNumberGenerator.nextInt(6) + 1;

        switch (randomNumber) {
            case 1:
                imageDie2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageDie2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageDie2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageDie2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageDie2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageDie2.setImageResource(R.drawable.dice6);
                break;
        }
    }
    private void rollDie3() {
        int randomNumber = randomNumberGenerator.nextInt(6) + 1;

        switch (randomNumber) {
            case 1:
                imageDie3.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageDie3.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageDie3.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageDie3.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageDie3.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageDie3.setImageResource(R.drawable.dice6);
                break;
        }
    }
    private void rollDie4() {
        int randomNumber = randomNumberGenerator.nextInt(6) + 1;

        switch (randomNumber) {
            case 1:
                imageDie4.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageDie4.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageDie4.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageDie4.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageDie4.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageDie4.setImageResource(R.drawable.dice6);
                break;
        }
    }
    private void rollDie5() {
        int randomNumber = randomNumberGenerator.nextInt(6) + 1;

        switch (randomNumber) {
            case 1:
                imageDie5.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageDie5.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageDie5.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageDie5.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageDie5.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageDie5.setImageResource(R.drawable.dice6);
                break;
        }
    }
    private void rollDie6() {
        int randomNumber = randomNumberGenerator.nextInt(6) + 1;

        switch (randomNumber) {
            case 1:
                imageDie6.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageDie6.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageDie6.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageDie6.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageDie6.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageDie6.setImageResource(R.drawable.dice6);
                break;
        }
    }
}