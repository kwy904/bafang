package com.gd123.bafang;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.gd123.bafang.adapter.Main_tab_Adapter;
import com.gd123.bafang.fragment.ClassifyFragment;
import com.gd123.bafang.fragment.RecommendFragment;
import com.gd123.bafang.fragment.SubscriptionFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {


    private TabLayout tab_FindFragment_title;                            //定义TabLayout
    private ViewPager vp_FindFragment_pager;                             //定义viewPager
    private FragmentPagerAdapter fAdapter;                               //定义adapter

    private List<Fragment> list_fragment;                                //定义要装fragment的列表
    private List<String> list_title;                                     //tab名称列表

    private ClassifyFragment classifyFragment;
    private RecommendFragment recommendFragment;
    private SubscriptionFragment subscriptionFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initToolBar();
        initControls();
    }

    private void initControls() {


        tab_FindFragment_title = (TabLayout)findViewById(R.id.tab_FindFragment_title);
        vp_FindFragment_pager = (ViewPager) findViewById(R.id.vp_FindFragment_pager);

        //初始化各fragment
        classifyFragment = new ClassifyFragment();
        recommendFragment = new RecommendFragment();
        subscriptionFragment = new SubscriptionFragment();

        //将fragment装进列表中
        list_fragment = new ArrayList<>();
        list_fragment.add(classifyFragment);
        list_fragment.add(recommendFragment);
        list_fragment.add(subscriptionFragment);

        //将名称加载tab名字列表，正常情况下，我们应该在values/arrays.xml中进行定义然后调用
        list_title = new ArrayList<>();
        list_title.add("推荐");
        list_title.add("分类");
        list_title.add("订阅");

        //设置TabLayout的模式
        tab_FindFragment_title.setTabMode(TabLayout.MODE_FIXED);
        //为TabLayout添加tab名称
        tab_FindFragment_title.addTab(tab_FindFragment_title.newTab().setText(list_title.get(0)));
        tab_FindFragment_title.addTab(tab_FindFragment_title.newTab().setText(list_title.get(1)));
        tab_FindFragment_title.addTab(tab_FindFragment_title.newTab().setText(list_title.get(2)));

        fAdapter = new Main_tab_Adapter(getSupportFragmentManager(),list_fragment,list_title);

        //viewpager加载adapter
        vp_FindFragment_pager.setAdapter(fAdapter);
        //tab_FindFragment_title.setViewPager(vp_FindFragment_pager);
        //TabLayout加载viewpager
        tab_FindFragment_title.setupWithViewPager(vp_FindFragment_pager);
        //tab_FindFragment_title.set

    }

    private void initToolBar() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

//        toolbar.setNavigationIcon(R.mipmap.ic_launcher);//设置导航栏图标
//        toolbar.setLogo(R.mipmap.ic_launcher);//设置app logo
        toolbar.setTitle(R.string.app_name);//设置主标题
        toolbar.inflateMenu(R.menu.base_toolbar_menu);//设置右上角的填充菜单
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int menuItemId = item.getItemId();
                if (menuItemId == R.id.action_search) {
                    Toast.makeText(MainActivity.this , R.string.menu_search , Toast.LENGTH_SHORT).show();

                } else if (menuItemId == R.id.action_download) {
                    Toast.makeText(MainActivity.this , R.string.menu_download, Toast.LENGTH_SHORT).show();

                } else if (menuItemId == R.id.action_item1) {
                    Toast.makeText(MainActivity.this , R.string.timing , Toast.LENGTH_SHORT).show();

                } else if (menuItemId == R.id.action_item2) {
                    Toast.makeText(MainActivity.this , R.string.setting , Toast.LENGTH_SHORT).show();

                }
                return true;
            }
        });


    }
}
