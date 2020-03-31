package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "201621196박시온 onCreate() called!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "201621196박시온 onStart() called!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "201621196박시온 onRestart() called!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "201621196박시온 onStrop() called!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "201621196박시온 onPause() called!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "201621196박시온 onDestroy() called!");
    }
}
