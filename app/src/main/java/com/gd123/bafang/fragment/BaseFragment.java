package com.gd123.bafang.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.gd123.bafang.MainActivity;

/**
 * Created by Administrator on 2016/12/29.
 */
public class BaseFragment extends Fragment{

    protected MainActivity mainActivity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mainActivity = (MainActivity) context;
    }

}
