package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView flashcardQuestion = findViewById(R.id.flashcard_question);
        final TextView flashcardAnswer = findViewById(R.id.flashcard_answer);
        final TextView first_option = findViewById(R.id.first_option);
        final TextView second_option = findViewById(R.id.second_option);
        final TextView third_option = findViewById(R.id.third_option);
        final TextView fourth_option = findViewById(R.id.fourth_option);
        final ImageView eye_image = findViewById(R.id.toggle_choices_visibility);
        final ImageView eye_image_2 = findViewById(R.id.toggle_choices_visibility_2);
        flashcardQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flashcardAnswer.setVisibility(View.VISIBLE);
                flashcardQuestion.setVisibility(View.INVISIBLE);
            }

                                             });
        flashcardAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                flashcardQuestion.setVisibility(view.VISIBLE);
                flashcardAnswer.setVisibility(view.INVISIBLE);
            }

         });
        first_option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_option.setBackgroundColor(getResources().getColor(R.color.Red, null));;

            }
        });
        second_option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                second_option.setBackgroundColor(getResources().getColor(R.color.Red, null));;

            }
        });
        third_option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                third_option.setBackgroundColor(getResources().getColor(R.color.Red, null));;

            }
        });
        fourth_option.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fourth_option.setBackgroundColor(getResources().getColor(R.color.deepBlue, null));
            }
        });
        eye_image_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eye_image_2.setVisibility(view.INVISIBLE);
                eye_image.setVisibility(view.VISIBLE);
                first_option.setVisibility(view.VISIBLE);
                second_option.setVisibility(view.VISIBLE);
                third_option.setVisibility(view.VISIBLE);
                fourth_option.setVisibility(view.VISIBLE);

            }
        });
        eye_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eye_image_2.setVisibility(view.VISIBLE);
                eye_image.setVisibility(view.INVISIBLE);
                first_option.setVisibility(view.INVISIBLE);
                second_option.setVisibility(view.INVISIBLE);
                third_option.setVisibility(view.INVISIBLE);
                fourth_option.setVisibility(view.INVISIBLE);
            }
        });

            }

    }
