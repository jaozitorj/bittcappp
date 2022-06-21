package com.example.video;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityquiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainquiz);
    }


    public void init(View view){
        Intent intent = new Intent(this, com.example.video.QuestionActivity.class);
        startActivity(intent);
        finish();
    }

}
