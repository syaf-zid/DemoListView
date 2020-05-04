package com.example.demolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String[] info = intent.getStringArrayExtra("info");
        TextView textView = findViewById(R.id.textView);
        textView.setText(info[0] + " Star: " + info[1]);
    }
}
