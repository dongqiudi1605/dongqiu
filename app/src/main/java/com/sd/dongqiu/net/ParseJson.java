package com.sd.dongqiu.net;

import com.google.gson.Gson;
import com.sd.dongqiu.bean.Shuju_goal_ranking;
import com.sd.dongqiu.bean.Shuju_match_ranking;
import com.sd.dongqiu.bean.Shuju_team_ranking;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/13.
 */
public class ParseJson {
    public static Shuju_team_ranking parseJson2Shuju_team_ranking(String json) {
        Shuju_team_ranking team=null;
        Gson gson = new Gson();
        team = gson.fromJson(json, Shuju_team_ranking.class);
        return team;
    }
    public static List<Shuju_goal_ranking>parseJson2Shuju_goal_ranking(String json){
        List<Shuju_goal_ranking> list = new ArrayList<>();
        return null;
    }
    public static List<Shuju_match_ranking>parseJson2Shuju_match_ranking(String json){
        List<Shuju_match_ranking> list = new ArrayList<>();
        return null;
    }
}
