package com.relic.android.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.relic.android.R;

public class MainActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
