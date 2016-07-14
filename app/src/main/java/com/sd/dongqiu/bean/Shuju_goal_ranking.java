package com.sd.dongqiu.bean;

/**
 * Created by Administrator on 2016/7/9.
 */
public class Shuju_goal_ranking {
    /**
     * person_id : 13192
     * name : 登巴-巴                 //球员
     * team_id : 433
     * team_name : 上海绿地申花       //球队
     * count : 14                    //进球
     */

    private String person_id;
    private String name;
    private String team_id;
    private String team_name;
    private String count;

    public String getPerson_id() {
        return person_id;
    }

    public void setPerson_id(String person_id) {
        this.person_id = person_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam_id() {
        return team_id;
    }

    public void setTeam_id(String team_id) {
        this.team_id = team_id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
