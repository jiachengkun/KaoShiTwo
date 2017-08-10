package com.jiyun.test.kaoshitwo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.jiyun.test.kaoshitwo.R;
import com.jiyun.test.kaoshitwo.Student;

import java.util.ArrayList;

/**
 * Created by 贾成昆 on 2017/6/22.
 */

public class MyAdapter extends BaseAdapter {

    Context mContext;
    ArrayList<Student> list;

    public MyAdapter(Context mContext, ArrayList<Student> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder;
        if (convertView==null) {
            holder = new Holder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.list_item, null);
            holder.myname = (TextView) convertView.findViewById(R.id.tv_name);
            holder.shoucang= (Button) convertView.findViewById(R.id.button_shoucang);
            convertView.setTag(holder);
        }else {
            holder= (Holder) convertView.getTag();
        }
        holder.myname.setText(list.get(position).getName());
        return convertView;
    }
    class Holder{
        TextView myname;
        Button shoucang;
    }
}
