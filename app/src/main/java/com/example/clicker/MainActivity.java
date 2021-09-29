package com.example.clicker;

import static com.example.clicker.R.drawable.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    ImageButton increase, decrease, discharge;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score = 0;
        text = (TextView) findViewById(R.id.text);
        increase = (ImageButton) findViewById(R.id.increase);
        decrease = (ImageButton) findViewById(R.id.decrease);
        discharge = (ImageButton) findViewById(R.id.discharge);
        Click();
    }



    void Click(){
        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score++;
                if (score == 2 || score == 3 || score == 4) {
                    text.setText("Кнопка нажата " + score + " раза");
                }
                else if (score != 2 || score != 3 || score != 4){
                    text.setText("Кнопка нажата " + score + " раз");
                }
            }
        });
        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (score > 0) {
                    score--;
                }
                if (score == 2 || score == 3 || score == 4) {
                    text.setText("Кнопка нажата " + score + " раза");
                }
                else if (score != 2 || score != 3 || score != 4){
                    text.setText("Кнопка нажата " + score + " раз");
                }
            }
        });
        discharge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
                text.setText("Сброс до: " + score);
            }
        });
    }
}