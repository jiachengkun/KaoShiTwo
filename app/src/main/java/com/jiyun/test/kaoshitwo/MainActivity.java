package com.jiyun.test.kaoshitwo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.jiyun.test.kaoshitwo.adapter.MyPagerAdapter;
import com.jiyun.test.kaoshitwo.fragment.FragmentShouCang;
import com.jiyun.test.kaoshitwo.fragment.FragmentZhiShi;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ViewPager myviewpager;
    private Button tv_zhishi;
    private Button tv_shoucang;
    private LinearLayout linear;
    private RelativeLayout activity_main;
    ArrayList<Fragment>mlist=new ArrayList<>();

    FragmentZhiShi zhiShi;
    FragmentShouCang shouCang;
    private MyPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        zhiShi=new FragmentZhiShi();
        shouCang=new FragmentShouCang();
        mlist.add(zhiShi);
        mlist.add(shouCang);

        pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(),mlist);
        myviewpager.setAdapter(pagerAdapter);

    }

    private void initView() {
        myviewpager= (ViewPager) findViewById(R.id.my_viewpager);
        tv_zhishi = (Button) findViewById(R.id.tv_zhishi);
        tv_shoucang = (Button) findViewById(R.id.tv_shoucang);
        linear = (LinearLayout) findViewById(R.id.linear);
        activity_main = (RelativeLayout) findViewById(R.id.activity_main);

        tv_zhishi.setOnClickListener(this);
        tv_shoucang.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_zhishi:
                myviewpager.setCurrentItem(0);
                break;
            case R.id.tv_shoucang:
                myviewpager.setCurrentItem(1);
                break;
        }
    }
}
