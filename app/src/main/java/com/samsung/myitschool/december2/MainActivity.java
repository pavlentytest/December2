package com.samsung.myitschool.december2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO(all): Create google
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // тут что-то должно быть

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        // мега логика
        // Ромка - первый
        // Павел Валерьевич - супер!
        // Я - второй
        // Ромка - лох 123
        // MUDAMUDAMUDAMUDAMUDAMUDAMUDAMUDAMUDAMUDAMUDAMUDAMUDA
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return false;




      //  bvbbmvbm
    }
}
