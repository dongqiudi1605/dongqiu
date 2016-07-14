package com.sd.dongqiu.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.sd.dongqiu.bean.Shuju_goal_ranking;

import java.util.List;

/**
 * Created by Administrator on 2016/7/13.
 */
public class ShujuGoalAdapter extends RecyclerView.Adapter {


    private List<Shuju_goal_ranking> list;
    private Context context;
    private LayoutInflater inflater;
    private int arg1;

    public ShujuGoalAdapter(Context context, List<Shuju_goal_ranking> list, int arg1) {
        this.list = list;
        this.context = context;
        this.arg1 = arg1;
        inflater = LayoutInflater.from(context);
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
