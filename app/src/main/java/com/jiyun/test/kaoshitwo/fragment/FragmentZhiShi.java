package com.jiyun.test.kaoshitwo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.jiyun.test.kaoshitwo.R;
import com.jiyun.test.kaoshitwo.Student;
import com.jiyun.test.kaoshitwo.adapter.MyAdapter;

import java.util.ArrayList;

/**
 * Created by 贾成昆 on 2017/6/22.
 */

public class FragmentZhiShi extends Fragment{

    ListView listView;
    ArrayList<Student> mlist=new ArrayList<>();
    MyAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.zhishi_fragment,null);
        listView= (ListView) view.findViewById(R.id.zhishi_list);

        for (int i=0;i<10;i++){
            Student stu=new Student();
            stu.setName("新闻标题"+i);
            mlist.add(stu);
        }

        adapter=new MyAdapter(getActivity(),mlist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
        return view;
    }
}
