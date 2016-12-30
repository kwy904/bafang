package com.gd123.bafang.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.gd123.bafang.R;

/**
 * Created by ywk on 2016/12/30 10:18
 */

public class RecommendViewHolder extends RecyclerView.ViewHolder {

    private final TextView mItemTextView;

    public RecommendViewHolder(final View parent, TextView itemTextView) {
        super(parent);
        mItemTextView = itemTextView;
    }



    public static RecommendViewHolder newInstance(View parent) {
        TextView itemTextView = (TextView) parent.findViewById(R.id.itemTextView);
        return new RecommendViewHolder(parent, itemTextView);
    }

    public void setItemText(CharSequence text) {
        mItemTextView.setText(text);
    }
}
