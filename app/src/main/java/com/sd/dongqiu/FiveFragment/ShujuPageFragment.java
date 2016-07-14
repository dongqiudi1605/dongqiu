package com.sd.dongqiu.FiveFragment;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.bartoszlipinski.recyclerviewheader.RecyclerViewHeader;
import com.sd.dongqiu.Adapter.ShujuGoalAdapter;
import com.sd.dongqiu.Adapter.ShujuMatchAdapter;
import com.sd.dongqiu.Adapter.ShujuTeamAdapter;
import com.sd.dongqiu.R;
import com.sd.dongqiu.bean.Constants;
import com.sd.dongqiu.bean.Shuju_goal_ranking;
import com.sd.dongqiu.bean.Shuju_match_ranking;
import com.sd.dongqiu.bean.Shuju_team_ranking;
import com.sd.dongqiu.net.OkHttpUtils;
import com.sd.dongqiu.net.ParseJson;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by Administrator on 2016/7/11.
 */
public class ShujuPageFragment extends Fragment {

    private RadioGroup radioGroup;
    private RadioButton button1;
    private ListView listView;
    private String id;

    private ProgressBar progressBar;

    private TextView textView;
    private RecyclerView recyclerView;
    private String url;

    //通过id来拼接每一个分类的请求地址
    //index用来标注该Fragment是第几个Fragment（）
    public static ShujuPageFragment newInstance(String id, int index) {
        Bundle args = new Bundle();
        args.putString("id", id);
        args.putInt("index", index);
        ShujuPageFragment pageFragment = new ShujuPageFragment();
        pageFragment.setArguments(args);
        return pageFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_shuju_blank, container, false);

        initview();
        return view;
    }

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            //设置布局管理器，必须设置,不然没效果、recyclerView
            switch (msg.what) {
                case 0://数据
                    progressBar.setVisibility(View.GONE);
                    RecyclerViewHeader recyclerViewHeader = RecyclerViewHeader.fromXml(getActivity(), R.layout.shuju_team_header);
                    recyclerViewHeader.setBackgroundColor(Color.WHITE);
                    recyclerViewHeader.attachTo(recyclerView);
//                    Shuju_team_ranking team_ranking=(Shuju_team_ranking)msg.obj;
                    List<Shuju_team_ranking.RankingsBean> list = (List<Shuju_team_ranking.RankingsBean>) msg.obj;

                    ShujuTeamAdapter shujuTeamAdapter = new ShujuTeamAdapter(getActivity(), list);
                    recyclerView.setAdapter(shujuTeamAdapter);
                    break;
                case 1://射手、助攻
                    List<Shuju_goal_ranking> list1 = (List<Shuju_goal_ranking>) msg.obj;
                    int arg1 = msg.arg1;
                    ShujuGoalAdapter shujuGoalAdapter = new ShujuGoalAdapter(getActivity(), list1, arg1);
                    recyclerView.setAdapter(shujuGoalAdapter);
                    break;
//                case 2:
//                    List<Shuju_goal_ranking> list = (List<Shuju_goal_ranking>) msg.obj;
////                    MyAdapter adapter = new MyAdapter(MainActivity.this, list);
////                    listView.setAdapter(adapter);
//                    break;
                case 3://赛程
                    List<Shuju_match_ranking> list3 = (List<Shuju_match_ranking>) msg.obj;
                    ShujuMatchAdapter shujuMatchAdapter = new ShujuMatchAdapter(getActivity(), list3);
                    recyclerView.setAdapter(shujuMatchAdapter);
                    break;
                default:
                    super.handleMessage(msg);//这里最好对不需要或者不关心的消息抛给父类，避免丢失消息
                    break;
            }
        }
    };


    private int index = 0;

    private void initview() {

        radioGroup = (RadioGroup) view.findViewById(R.id.shuju_vp_rg);
        button1 = (RadioButton) view.findViewById(R.id.shuju_vp_rb1);
        button1.setChecked(true);
        recyclerView = (RecyclerView) view.findViewById(R.id.shuju_vp_RecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        //设置头部，必须在设置布局管理器之后

        textView = (TextView) view.findViewById(R.id.nodata);
        //当ListView中没有数据时显示TextView
//        listView.setEmptyView(textView);
        progressBar = (ProgressBar) view.findViewById(R.id.progress_bar);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {

                    case R.id.shuju_vp_rb1://数据
                        index = 0;
                        url = Constants.FOOTBALLURL + "team_ranking/" + id;
                        break;
                    case R.id.shuju_vp_rb2://射手
                        index = 1;
                        url = Constants.FOOTBALLURL + "goal_ranking/" + Constants.IDS[Constants.VIEWPAGERNUM];
                        break;
                    case R.id.shuju_vp_rb3://助攻
                        index = 2;
                        url = Constants.FOOTBALLURL + "assist_ranking/" + Constants.IDS[Constants.VIEWPAGERNUM];
                        break;
                    case R.id.shuju_vp_rb4://赛程
                        index = 3;
                        url = Constants.FOOTBALLURL;
                        break;
                }
            }
        });
        initData();
    }

    private void initData() {
        final Callback callback = new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    String data = response.body().string();
                    data = data.substring(1, data.length() - 1);//去掉data第一个“[”和最后一个"]"
                    Message message = mHandler.obtainMessage();
                    if (index == 1) {//射手、与index == 2共用一个实例
                        List<Shuju_goal_ranking> list = ParseJson.parseJson2Shuju_goal_ranking(data);
                        message.obj = list;
                        message.arg1 = 1;//用于区别设置item【0】
                        message.what = 1;//与index == 2相同
                    } else if (index == 2) {//助攻、与index == 1共用一个实例
                        List<Shuju_goal_ranking> list = ParseJson.parseJson2Shuju_goal_ranking(data);
                        message.obj = list;
                        message.arg1 = 2;//用于区别设置item【0】
                        message.what = 1;////与index == 1相同
                    } else if (index == 3) {//赛程
                        List<Shuju_match_ranking> list = ParseJson.parseJson2Shuju_match_ranking(data);
                        message.obj = list;
                        message.what = 3;
                    } else {//积分
                        Shuju_team_ranking team_ranking = ParseJson.parseJson2Shuju_team_ranking(data);
                        List<Shuju_team_ranking.RankingsBean> rankings = team_ranking.getRankings();
                        message.obj = rankings;
                        message.what = 0;
                    }
                    mHandler.sendMessage(message);
                }
            }
        };
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                id = getArguments().getString("id");
                url = Constants.FOOTBALLURL + "team_ranking/" + id;
                Log.d("ShujuPageFragment", "_________________" + id);
                Log.d("ShujuPageFragment", "_________________" + url);
                OkHttpUtils.getData(url, callback);
            }
        };
        new Thread(runnable).start();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mHandler.removeCallbacksAndMessages(null);
    }
}
