package com.example.myapplication;

import android.view.View;

class MyOnClickListener implements View.OnClickListener {
    MainActivity caller;
    public MyOnClickListener(MainActivity mainActivity){
        caller = mainActivity;
    }
    @Override
    public void onClick(View v) {
        caller.textView.setText("You Clicked the button!");
    }
}
