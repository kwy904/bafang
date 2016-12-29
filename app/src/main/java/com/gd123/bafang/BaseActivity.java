package com.gd123.bafang;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ywk on 2016/12/29 15:02
 */

public class BaseActivity extends AppCompatActivity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
    }
}
