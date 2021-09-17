package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnAddClicked(View view) {
        int rs = 10;
        Toast.makeText(getApplicationContext(), "결과 : " + rs, Toast.LENGTH_SHORT).show();
    }
}