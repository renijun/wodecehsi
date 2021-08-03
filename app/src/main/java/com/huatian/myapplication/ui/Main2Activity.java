package com.huatian.myapplication.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.huatian.myapplication.R;
import com.huatian.myapplication.dev.DEV;

public class Main2Activity extends AppCompatActivity {


    private DEV dev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        dev=new DEV();
        dev.getDev();
    }
}
