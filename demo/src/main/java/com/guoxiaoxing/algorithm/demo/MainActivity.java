package com.guoxiaoxing.algorithm.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_list_add).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_list_add:
                ListOperation.addFirst(new ArrayList<Integer>());
                ListOperation.addFirst(new LinkedList<Integer>());
                ListOperation.addEnd(new ArrayList<Integer>());
                ListOperation.addEnd(new LinkedList<Integer>());
                break;
        }
    }
}
