package com.example.xiqu01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void init(){
        Log.d("xiqu","this is test");
    }

    public void init2(){
        Log.d("xiqu","this is test 2");
    }

    public void init3(){
        Log.d("xiqu","this is test 3");
    }
    public void init4(){
        Log.d("xiqu","this is test 4");
    }


}
