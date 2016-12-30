package com.gd123.bafang.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gd123.bafang.R;
import com.gd123.bafang.viewholder.RecommendViewHolder;

import java.util.List;

/**
 * Created by ywk on 2016/12/30 10:16
 */

public class RecommendAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{


    private List<String> mItemList;


    public RecommendAdapter(List<String> mItemList) {
        this.mItemList = mItemList;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_item, parent, false);
        return RecommendViewHolder.newInstance(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        RecommendViewHolder viewHolder = (RecommendViewHolder) holder;
        viewHolder.setItemText(mItemList.get(position));
    }

    @Override
    public int getItemCount() {
        return mItemList == null ? 0 : mItemList.size();
    }
}
