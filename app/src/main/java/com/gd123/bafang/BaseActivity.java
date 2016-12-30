package com.gd123.bafang;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/**
 * Created by ywk on 2016/12/29 15:02
 */

public class BaseActivity extends AppCompatActivity {
    private FrameLayout mContentContainer;
    private View mFloatView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    protected void onStart() {
        super.onStart();


        View view = getWindow().getDecorView().findViewById(R.id.activity_main);
        FrameLayout frameLayout = (FrameLayout)view;
        mFloatView = LayoutInflater.from(getBaseContext()).inflate(R.layout.layout_bottom, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.gravity = Gravity.BOTTOM;
        frameLayout.addView(mFloatView, layoutParams);
    }
}
