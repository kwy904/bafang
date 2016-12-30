package com.gd123.bafang.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

import com.gd123.bafang.HidingScrollListener;
import com.gd123.bafang.R;
import com.gd123.bafang.Utils;
import com.gd123.bafang.adapter.RecommendAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ywk on 2016/12/29 16:52
 */

public class RecommendFragment extends BaseFragment {

    private RecyclerView mRecyclerView;
    private int mToolbarHeight;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_recommend, container, false);
        setupView(view);
        return view;


    }

    private void setupView(View view) {
        mToolbarHeight = Utils.getToolbarHeight(mainActivity);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView_fragment_recommend);
        int paddingTop = Utils.getToolbarHeight(mainActivity) + Utils.getTabsHeight(mainActivity);
        mRecyclerView.setPadding(mRecyclerView.getPaddingLeft(), paddingTop, mRecyclerView.getPaddingRight(), mRecyclerView.getPaddingBottom());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(mainActivity));
        RecommendAdapter recommendAdapter = new RecommendAdapter(getData());
        mRecyclerView.setAdapter(recommendAdapter);

        mRecyclerView.setOnScrollListener(new HidingScrollListener(mainActivity) {
            @Override
            public void onMoved(int distance) {
                mainActivity.mToolbarContainer.setTranslationY(-distance);
            }

            @Override
            public void onShow() {
                mainActivity.mToolbarContainer.animate().translationY(0).setInterpolator(new DecelerateInterpolator(2)).start();
            }

            @Override
            public void onHide() {
                mainActivity.mToolbarContainer.animate().translationY(-mToolbarHeight).setInterpolator(new AccelerateInterpolator(2)).start();
            }
        });
    }

    private List<String> getData() {
        List<String> items = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            items.add("item" + i);
        }
        return items;
    }
}
