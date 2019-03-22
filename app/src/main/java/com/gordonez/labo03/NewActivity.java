package com.gordonez.labo03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    private TextView mTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        mTextview = findViewById(R.id.tv_message);
        Intent mIntent = getIntent();
        if (mIntent != null){
            mTextview.setText(mIntent.getStringExtra(AppConstant.TEXT_KEY));
        }
    }
}
