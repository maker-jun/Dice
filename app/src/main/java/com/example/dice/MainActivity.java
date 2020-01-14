package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView tv_result;
    private Button btn_roll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        btn_roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random dice = new Random();
                int result = dice.nextInt(6)+1;
                tv_result.setText(String.valueOf(result));
            }
        });
    }
    public void init(){
        tv_result=(TextView) findViewById(R.id.tv_result);
        btn_roll=(Button) findViewById(R.id.btn_roll);
    }
}
