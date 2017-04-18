package com.simple.patterns;

import android.app.Activity;
import android.os.Bundle;

import StructuralPattern.ProxyPattern.DynamicProxy.Test;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Test test = new Test();
        test.main();
    }

}

