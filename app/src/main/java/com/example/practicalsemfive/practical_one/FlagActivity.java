package com.example.practicalsemfive.practical_one;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.practicalsemfive.R;

public class FlagActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag);
        imageView=(ImageView) findViewById(R.id.ivFlag);
        Intent intent=getIntent();
        imageView.setImageResource(intent.getIntExtra("flag",0));
    }
}
