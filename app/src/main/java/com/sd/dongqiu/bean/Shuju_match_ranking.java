package com.sd.dongqiu.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/7/9.
 */
public class Shuju_match_ranking {
    /**
     * endnum : 30
     * nownum : 16
     * matches : [{"relate_type":"match","relate_id":2207368,"match_id":"2207368","round_id":"34227","group_id":"-1","team_A_id":"3139","team_B_id":"21226","team_A_name":"辽宁宏运","team_B_name":"石家庄永昌","date_utc":"2016-07-08","time_utc":"11:35:00","fs_A":"2","fs_B":"1","ps_A":"","ps_B":"","ets_A":"","ets_B":"","as_A":"2","as_B":"1","suretime":"1","start_play":"2016-07-08 11:35:00","status":"Played","gameweek":"16","playing_time":"90"},{"relate_type":"match","relate_id":2207369,"match_id":"2207369","round_id":"34227","group_id":"-1","team_A_id":"3826","team_B_id":"433","team_A_name":"延边富德","team_B_name":"上海绿地申花","date_utc":"2016-07-09","time_utc":"07:30:00","fs_A":"","fs_B":"","ps_A":"","ps_B":"","ets_A":"","ets_B":"","as_A":"","as_B":"","suretime":"1","start_play":"2016-07-09 07:30:00","status":"Fixture","gameweek":"16","playing_time":null},{"relate_type":"match","relate_id":2207371,"match_id":"2207371","round_id":"34227","group_id":"-1","team_A_id":"434","team_B_id":"441","team_A_name":"山东鲁能","team_B_name":"江苏苏宁","date_utc":"2016-07-09","time_utc":"11:35:00","fs_A":"","fs_B":"","ps_A":"","ps_B":"","ets_A":"","ets_B":"","as_A":"","as_B":"","suretime":"1","start_play":"2016-07-09 11:35:00","status":"Fixture","gameweek":"16","playing_time":null},{"relate_type":"match","relate_id":2207375,"match_id":"2207375","round_id":"34227","group_id":"-1","team_A_id":"429","team_B_id":"431","team_A_name":"北京国安","team_B_name":"天津泰达","date_utc":"2016-07-09","time_utc":"11:35:00","fs_A":"","fs_B":"","ps_A":"","ps_B":"","ets_A":"","ets_B":"","as_A":"","as_B":"","suretime":"1","start_play":"2016-07-09 11:35:00","status":"Fixture","gameweek":"16","playing_time":null},{"relate_type":"match","relate_id":2207372,"match_id":"2207372","round_id":"34227","group_id":"-1","team_A_id":"437","team_B_id":"446","team_A_name":"长春亚泰","team_B_name":"杭州绿城","date_utc":"2016-07-10","time_utc":"07:30:00","fs_A":"","fs_B":"","ps_A":"","ps_B":"","ets_A":"","ets_B":"","as_A":"","as_B":"","suretime":"1","start_play":"2016-07-10 07:30:00","status":"Fixture","gameweek":"16","playing_time":null},{"relate_type":"match","relate_id":2207370,"match_id":"2207370","round_id":"34227","group_id":"-1","team_A_id":"21563","team_B_id":"425","team_A_name":"河北华夏幸福","team_B_name":"广州富力","date_utc":"2016-07-10","time_utc":"11:35:00","fs_A":"","fs_B":"","ps_A":"","ps_B":"","ets_A":"","ets_B":"","as_A":"","as_B":"","suretime":"1","start_play":"2016-07-10 11:35:00","status":"Fixture","gameweek":"16","playing_time":null},{"relate_type":"match","relate_id":2207373,"match_id":"2207373","round_id":"34227","group_id":"-1","team_A_id":"10655","team_B_id":"442","team_A_name":"上海上港","team_B_name":"河南建业","date_utc":"2016-07-10","time_utc":"11:35:00","fs_A":"","fs_B":"","ps_A":"","ps_B":"","ets_A":"","ets_B":"","as_A":"","as_B":"","suretime":"1","start_play":"2016-07-10 11:35:00","status":"Fixture","gameweek":"16","playing_time":null},{"relate_type":"match","relate_id":2207374,"match_id":"2207374","round_id":"34227","group_id":"-1","team_A_id":"6648","team_B_id":"432","team_A_name":"广州恒大淘宝","team_B_name":"重庆力帆","date_utc":"2016-07-10","time_utc":"11:35:00","fs_A":"","fs_B":"","ps_A":"","ps_B":"","ets_A":"","ets_B":"","as_A":"","as_B":"","suretime":"1","start_play":"2016-07-10 11:35:00","status":"Fixture","gameweek":"16","playing_time":null}]
     */

    private String endnum;
    private String nownum;
    /**
     * relate_type : match
     * relate_id : 2207368
     * match_id : 2207368
     * round_id : 34227
     * group_id : -1
     * team_A_id : 3139
     * team_B_id : 21226
     * team_A_name : 辽宁宏运
     * team_B_name : 石家庄永昌
     * date_utc : 2016-07-08
     * time_utc : 11:35:00
     * fs_A : 2
     * fs_B : 1
     * ps_A :
     * ps_B :
     * ets_A :
     * ets_B :
     * as_A : 2
     * as_B : 1
     * suretime : 1
     * start_play : 2016-07-08 11:35:00
     * status : Played
     * gameweek : 16
     * playing_time : 90
     */

    private List<MatchesBean> matches;

    public String getEndnum() {
        return endnum;
    }

    public void setEndnum(String endnum) {
        this.endnum = endnum;
    }

    public String getNownum() {
        return nownum;
    }

    public void setNownum(String nownum) {
        this.nownum = nownum;
    }

    public List<MatchesBean> getMatches() {
        return matches;
    }

    public void setMatches(List<MatchesBean> matches) {
        this.matches = matches;
    }

    public static class MatchesBean {
        private String relate_type;
        private int relate_id;
        private String match_id;
        private String round_id;
        private String group_id;
        private String team_A_id;
        private String team_B_id;
        private String team_A_name;
        private String team_B_name;
        private String date_utc;
        private String time_utc;
        private String fs_A;
        private String fs_B;
        private String ps_A;
        private String ps_B;
        private String ets_A;
        private String ets_B;
        private String as_A;
        private String as_B;
        private String suretime;
        private String start_play;
        private String status;
        private String gameweek;
        private String playing_time;

        public String getRelate_type() {
            return relate_type;
        }

        public void setRelate_type(String relate_type) {
            this.relate_type = relate_type;
        }

        public int getRelate_id() {
            return relate_id;
        }

        public void setRelate_id(int relate_id) {
            this.relate_id = relate_id;
        }

        public String getMatch_id() {
            return match_id;
        }

        public void setMatch_id(String match_id) {
            this.match_id = match_id;
        }

        public String getRound_id() {
            return round_id;
        }

        public void setRound_id(String round_id) {
            this.round_id = round_id;
        }

        public String getGroup_id() {
            return group_id;
        }

        public void setGroup_id(String group_id) {
            this.group_id = group_id;
        }

        public String getTeam_A_id() {
            return team_A_id;
        }

        public void setTeam_A_id(String team_A_id) {
            this.team_A_id = team_A_id;
        }

        public String getTeam_B_id() {
            return team_B_id;
        }

        public void setTeam_B_id(String team_B_id) {
            this.team_B_id = team_B_id;
        }

        public String getTeam_A_name() {
            return team_A_name;
        }

        public void setTeam_A_name(String team_A_name) {
            this.team_A_name = team_A_name;
        }

        public String getTeam_B_name() {
            return team_B_name;
        }

        public void setTeam_B_name(String team_B_name) {
            this.team_B_name = team_B_name;
        }

        public String getDate_utc() {
            return date_utc;
        }

        public void setDate_utc(String date_utc) {
            this.date_utc = date_utc;
        }

        public String getTime_utc() {
            return time_utc;
        }

        public void setTime_utc(String time_utc) {
            this.time_utc = time_utc;
        }

        public String getFs_A() {
            return fs_A;
        }

        public void setFs_A(String fs_A) {
            this.fs_A = fs_A;
        }

        public String getFs_B() {
            return fs_B;
        }

        public void setFs_B(String fs_B) {
            this.fs_B = fs_B;
        }

        public String getPs_A() {
            return ps_A;
        }

        public void setPs_A(String ps_A) {
            this.ps_A = ps_A;
        }

        public String getPs_B() {
            return ps_B;
        }

        public void setPs_B(String ps_B) {
            this.ps_B = ps_B;
        }

        public String getEts_A() {
            return ets_A;
        }

        public void setEts_A(String ets_A) {
            this.ets_A = ets_A;
        }

        public String getEts_B() {
            return ets_B;
        }

        public void setEts_B(String ets_B) {
            this.ets_B = ets_B;
        }

        public String getAs_A() {
            return as_A;
        }

        public void setAs_A(String as_A) {
            this.as_A = as_A;
        }

        public String getAs_B() {
            return as_B;
        }

        public void setAs_B(String as_B) {
            this.as_B = as_B;
        }

        public String getSuretime() {
            return suretime;
        }

        public void setSuretime(String suretime) {
            this.suretime = suretime;
        }

        public String getStart_play() {
            return start_play;
        }

        public void setStart_play(String start_play) {
            this.start_play = start_play;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getGameweek() {
            return gameweek;
        }

        public void setGameweek(String gameweek) {
            this.gameweek = gameweek;
        }

        public String getPlaying_time() {
            return playing_time;
        }

        public void setPlaying_time(String playing_time) {
            this.playing_time = playing_time;
        }
    }
}
