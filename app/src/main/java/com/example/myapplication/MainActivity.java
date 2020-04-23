package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "201621196박시온 onCreate() called!");

        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new MyOnClickListener(this));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "201621196박시온 onStart() called!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "201621196박시온 onRestart() called!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "201621196박시온 onStop() called!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "201621196박시온 onPause() called!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "201621196박시온 onDestroy() called!");
    }
}
