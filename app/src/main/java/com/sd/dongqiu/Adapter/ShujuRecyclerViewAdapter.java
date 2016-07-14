package com.sd.dongqiu.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2016/7/12.
 */
public class ShujuRecyclerViewAdapter extends RecyclerView.Adapter {
    private List<String> list;
    private Context context;
    private LayoutInflater inflater;

    public ShujuRecyclerViewAdapter(Context context, List<String> list) {
        this.context = context;
        this.list = list;
        inflater = LayoutInflater.from(context);
    }
    //初始化ViewHolder，类似于BaseAdapter中getView方法的if(){}功能
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }
    //数据绑定，类似于BaseAdapter中getView方法中数据绑定的功能
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }
    //返回RecyclerView中条目总数
    @Override
    public int getItemCount() {
        return 0;
    }
    private class MyViewHolder extends RecyclerView.ViewHolder{
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }

}
