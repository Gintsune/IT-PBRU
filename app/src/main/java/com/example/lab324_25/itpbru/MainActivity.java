package com.example.lab324_25.itpbru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }   //Main Method

    public void clickSignUpMain(View view) {
        startActivitiy(new Intent(MainActivity.this, SignUpActivity.class));
    }

}   // Main Class นี่คือคลาสหลัก
