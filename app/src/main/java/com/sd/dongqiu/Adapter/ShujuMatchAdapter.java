package com.sd.dongqiu.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.sd.dongqiu.bean.Shuju_match_ranking;

import java.util.List;

/**
 * Created by Administrator on 2016/7/13.
 */
public class ShujuMatchAdapter extends RecyclerView.Adapter{
    private List<Shuju_match_ranking> list;
    private Context context;
    private LayoutInflater inflater;

    public ShujuMatchAdapter(Context context, List<Shuju_match_ranking> list) {
        this.list = list;
        this.context = context;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
