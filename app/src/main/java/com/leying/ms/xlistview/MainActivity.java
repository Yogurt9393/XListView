package com.leying.ms.xlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private XListView refreshlistview;
    private ListViewAdapter mAdapter;
    private List<String> mData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mData = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mData.add("这个是第"+i+"个");
        }
        refreshlistview = (XListView) findViewById(R.id.refreshlistview);
        mAdapter = new ListViewAdapter(mData,this);
        refreshlistview.setAdapter(mAdapter);
    }
}
