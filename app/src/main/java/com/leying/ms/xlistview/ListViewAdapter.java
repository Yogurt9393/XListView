package com.leying.ms.xlistview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by MS on 2017/11/17.
 */

public class ListViewAdapter extends BaseAdapter {
    private List<String> mData;
    private Context mContext;

    public ListViewAdapter(List<String> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null){
            holder = new ViewHolder();
            view = View.inflate(mContext,R.layout.item_listview,null);
            holder.textview = view.findViewById(R.id.textview);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }
        holder.textview.setText(mData.get(i));
        return view;
    }
    class ViewHolder{
        TextView textview;
    }
}
