package com.sd.dongqiu.Adapter;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sd.dongqiu.R;
import com.sd.dongqiu.bean.Shuju_team_ranking;

import java.util.List;

/**
 * Created by Administrator on 2016/7/13.
 */
public class ShujuTeamAdapter extends RecyclerView.Adapter {
    private List<Shuju_team_ranking.RankingsBean> list;
    private Context context;
    private LayoutInflater inflater;
//    private LinearLayout layout;

    public ShujuTeamAdapter(Context context, List<Shuju_team_ranking.RankingsBean> list) {
        this.list = list;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    //初始化ViewHolder，类似于BaseAdapter中getView方法的if(){}功能
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.shuju_team, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
//        layout = (LinearLayout) view.findViewById(R.id.sj_team_tv);
        return viewHolder;
    }

    //数据绑定，类似于BaseAdapter中getView方法中数据绑定的功能
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Shuju_team_ranking.RankingsBean rankingsBean = list.get(position);
//        if (position==0){
//            layout.setBackgroundColor(context.getColor(R.color.mainColor));
//        }
        ((MyViewHolder) holder).tv1.setText(rankingsBean.getRank());
        ((MyViewHolder) holder).tv2.setText(rankingsBean.getClub_name());
        ((MyViewHolder) holder).tv3.setText(rankingsBean.getMatches_total());
        ((MyViewHolder) holder).tv4.setText(rankingsBean.getMatches_won());
        ((MyViewHolder) holder).tv5.setText(rankingsBean.getMatches_draw());
        ((MyViewHolder) holder).tv6.setText(rankingsBean.getMatches_lost());
        ((MyViewHolder) holder).tv7.setText(rankingsBean.getGoals_pro()+"/"+rankingsBean.getGoals_against());
        ((MyViewHolder) holder).tv8.setText(rankingsBean.getPoints());
//        if (position>=0||position<4){
////            layout.setBackgroundColor(C);
//            layout.setBackgroundColor(Color.green(R.color.mainColor));
//        }
//        * club_name : 广州恒大淘宝       //球队
//                * matches_total : 16           //场
//                * matches_won : 12             //胜
//                * matches_draw : 3             //平
//                * matches_lost : 1             //负
//                * goals_pro : 32               //得
//                * goals_against : 7            //失
//                * points : 39                  //积分
//        ((MyViewHolder) holder).tv1.setText(list.get());
    }

    //返回RecyclerView中条目总数
    @Override
    public int getItemCount() {
        return list.size();
    }


    private class MyViewHolder extends RecyclerView.ViewHolder {

        private  TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8;

        //itemView表示布局文件
        public MyViewHolder(View itemView) {
            super(itemView);

            tv1 = (TextView) itemView.findViewById(R.id.sj_team_tv1);
             tv2 = (TextView) itemView.findViewById(R.id.sj_team_tv2);
             tv3 = (TextView) itemView.findViewById(R.id.sj_team_tv3);
             tv4 = (TextView) itemView.findViewById(R.id.sj_team_tv4);
             tv5 = (TextView) itemView.findViewById(R.id.sj_team_tv5);
             tv6 = (TextView) itemView.findViewById(R.id.sj_team_tv6);
             tv7 = (TextView) itemView.findViewById(R.id.sj_team_tv7);
             tv8 = (TextView) itemView.findViewById(R.id.sj_team_tv8);

        }
    }


}
