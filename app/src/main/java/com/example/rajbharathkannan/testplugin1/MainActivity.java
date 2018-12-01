package com.example.rajbharathkannan.testplugin1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.library.MyMathUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        double result = MyMathUtils.multiplyTwoNumbers(5.0, 10.0);
        Log.i("Result", result + "");
    }
}
