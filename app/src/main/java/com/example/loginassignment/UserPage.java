package com.example.loginassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.awt.font.TextAttribute;

public class UserPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_page);

        Intent i = getIntent();
        String userName = i.getStringExtra(MainActivity.Username);

        TextView textView = findViewById(R.id.textView);
        textView.setText(userName);
    }
}