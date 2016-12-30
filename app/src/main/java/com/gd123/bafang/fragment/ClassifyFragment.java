package com.gd123.bafang.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.gd123.bafang.R;

/**
 * Created by ywk on 2016/12/29 16:52
 */

public class ClassifyFragment extends BaseFragment {


    private static final String TAG =ClassifyFragment.class.getSimpleName() ;
    private RecyclerView mRecylerView;
    private ListView mListView;

    private int mTouchSlop = 0;               //最小滑动距离，超过了，才认为开始滑动
    private float mStartY = 0, mLastY = 0, mLastDeltaY;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_classify, container, false);
        setupView(view);
        return view;


    }

    private void setupView(View view) {

//        mListView = (ListView) view.findViewById(R.id.listview_classify);
//        mListView.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                final float y = motionEvent.getY();
//                float translationY = mainActivity.mMainToolbar.getTranslationY();
//                switch (motionEvent.getAction()) {
//                    case MotionEvent.ACTION_DOWN:
//                        mStartY = y;
//                        mLastY = mStartY;
//                        break;
//                    case MotionEvent.ACTION_MOVE:
//                        float mDeltaY = y - mLastY;
//                        float newTansY = translationY + mDeltaY;
//                        if (newTansY <= 0 && newTansY >= -mainActivity.mMainToolbar.getHeight()) {
//                            mainActivity.mMainToolbar.setTranslationY(newTansY);
//                        }
//                        mLastY = y;
//                        mLastDeltaY = mDeltaY;
//                        break;
//
//                    case MotionEvent.ACTION_UP:
//                        ObjectAnimator animator = null;
//                        if (mLastDeltaY < 0 && mListView.getFirstVisiblePosition() > 1) {
//                            Log.v(TAG, "listView.first=" + mListView.getFirstVisiblePosition());
//                            animator = ObjectAnimator.ofFloat(mainActivity.mMainToolbar, "translationY", mainActivity.mMainToolbar.getTranslationY(), -mainActivity.mMainToolbar.getHeight());
//                        } else {
//                            animator = ObjectAnimator.ofFloat(mainActivity.mMainToolbar, "translationY", mainActivity.mMainToolbar.getTranslationY(), 0);
//                        }
//                        animator.setDuration(100);
//                        animator.start();
//                        animator.setInterpolator(AnimationUtils.loadInterpolator(getActivity(), android.R.interpolator.linear));
//                        break;
//                }
//
//                return false;
//            }
//        });
    }


}
