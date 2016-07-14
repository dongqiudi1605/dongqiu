package com.sd.dongqiu.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/7/9.
 */
public class Shuju_team_ranking {

    /**
     * round_id : 34227         //*******
     * name : 常规赛
     * groups : 0               //******第几轮
     * rankingsCount : 16       //**************
     * aggrCount : 0
     * matchCount : 0
     * rankings : [{"id":"131901","rank":"1","adjust_rank":"0","last_rank":"1","team_id":"6648","club_name":"广州恒大淘宝","matches_total":"16","matches_won":"12","matches_draw":"3","matches_lost":"1","goals_pro":"32","goals_against":"7","points":"39"},{"id":"131906","rank":"2","adjust_rank":"0","last_rank":"3","team_id":"441","club_name":"江苏苏宁","matches_total":"16","matches_won":"9","matches_draw":"5","matches_lost":"2","goals_pro":"24","goals_against":"14","points":"32"},{"id":"131904","rank":"3","adjust_rank":"0","last_rank":"2","team_id":"21563","club_name":"河北华夏幸福","matches_total":"16","matches_won":"9","matches_draw":"3","matches_lost":"4","goals_pro":"22","goals_against":"17","points":"30"},{"id":"131909","rank":"4","adjust_rank":"0","last_rank":"4","team_id":"10655","club_name":"上海上港","matches_total":"16","matches_won":"7","matches_draw":"6","matches_lost":"3","goals_pro":"23","goals_against":"12","points":"27"},{"id":"131910","rank":"5","adjust_rank":"0","last_rank":"5","team_id":"433","club_name":"上海绿地申花","matches_total":"16","matches_won":"6","matches_draw":"7","matches_lost":"3","goals_pro":"27","goals_against":"15","points":"25"},{"id":"131905","rank":"6","adjust_rank":"0","last_rank":"6","team_id":"442","club_name":"河南建业","matches_total":"16","matches_won":"7","matches_draw":"4","matches_lost":"5","goals_pro":"14","goals_against":"12","points":"25"},{"id":"131912","rank":"7","adjust_rank":"0","last_rank":"7","team_id":"431","club_name":"天津泰达","matches_total":"16","matches_won":"5","matches_draw":"6","matches_lost":"5","goals_pro":"19","goals_against":"22","points":"21"},{"id":"131898","rank":"8","adjust_rank":"0","last_rank":"8","team_id":"429","club_name":"北京国安","matches_total":"15","matches_won":"5","matches_draw":"5","matches_lost":"5","goals_pro":"15","goals_against":"14","points":"20"},{"id":"131907","rank":"9","adjust_rank":"0","last_rank":"9","team_id":"3139","club_name":"辽宁宏运","matches_total":"16","matches_won":"5","matches_draw":"5","matches_lost":"6","goals_pro":"20","goals_against":"27","points":"20"},{"id":"131902","rank":"10","adjust_rank":"0","last_rank":"11","team_id":"425","club_name":"广州富力","matches_total":"16","matches_won":"5","matches_draw":"4","matches_lost":"7","goals_pro":"17","goals_against":"22","points":"19"},{"id":"131900","rank":"11","adjust_rank":"0","last_rank":"12","team_id":"432","club_name":"重庆力帆","matches_total":"16","matches_won":"4","matches_draw":"6","matches_lost":"6","goals_pro":"18","goals_against":"22","points":"18"},{"id":"131913","rank":"12","adjust_rank":"0","last_rank":"10","team_id":"3826","club_name":"延边富德","matches_total":"16","matches_won":"4","matches_draw":"4","matches_lost":"8","goals_pro":"18","goals_against":"22","points":"16"},{"id":"131903","rank":"13","adjust_rank":"0","last_rank":"15","team_id":"446","club_name":"杭州绿城","matches_total":"16","matches_won":"4","matches_draw":"3","matches_lost":"9","goals_pro":"12","goals_against":"20","points":"15"},{"id":"131911","rank":"14","adjust_rank":"0","last_rank":"13","team_id":"21226","club_name":"石家庄永昌","matches_total":"16","matches_won":"3","matches_draw":"5","matches_lost":"8","goals_pro":"13","goals_against":"22","points":"14"},{"id":"131899","rank":"15","adjust_rank":"0","last_rank":"14","team_id":"437","club_name":"长春亚泰","matches_total":"16","matches_won":"3","matches_draw":"4","matches_lost":"9","goals_pro":"11","goals_against":"26","points":"13"},{"id":"131908","rank":"16","adjust_rank":"0","last_rank":"16","team_id":"434","club_name":"山东鲁能","matches_total":"15","matches_won":"2","matches_draw":"4","matches_lost":"9","goals_pro":"13","goals_against":"24","points":"10"}]
     */

    private String round_id;
    private String name;
    private String groups;
    private String rankingsCount;
    private String aggrCount;
    private String matchCount;
    /**
     * id : 131901
     * rank : 1                  //名次
     * adjust_rank : 0
     * last_rank : 1
     * team_id : 6648
     * club_name : 广州恒大淘宝       //球队
     * matches_total : 16           //场
     * matches_won : 12             //胜
     * matches_draw : 3             //平
     * matches_lost : 1             //负
     * goals_pro : 32               //得
     * goals_against : 7            //失
     * points : 39                  //积分
     */

    private List<RankingsBean> rankings;

    public String getRound_id() {
        return round_id;
    }

    public void setRound_id(String round_id) {
        this.round_id = round_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public String getRankingsCount() {
        return rankingsCount;
    }

    public void setRankingsCount(String rankingsCount) {
        this.rankingsCount = rankingsCount;
    }

    public String getAggrCount() {
        return aggrCount;
    }

    public void setAggrCount(String aggrCount) {
        this.aggrCount = aggrCount;
    }

    public String getMatchCount() {
        return matchCount;
    }

    public void setMatchCount(String matchCount) {
        this.matchCount = matchCount;
    }

    public List<RankingsBean> getRankings() {
        return rankings;
    }

    public void setRankings(List<RankingsBean> rankings) {
        this.rankings = rankings;
    }

    public static class RankingsBean {
        private String id;
        private String rank;
        private String adjust_rank;
        private String last_rank;
        private String team_id;
        private String club_name;
        private String matches_total;
        private String matches_won;
        private String matches_draw;
        private String matches_lost;
        private String goals_pro;
        private String goals_against;
        private String points;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public String getAdjust_rank() {
            return adjust_rank;
        }

        public void setAdjust_rank(String adjust_rank) {
            this.adjust_rank = adjust_rank;
        }

        public String getLast_rank() {
            return last_rank;
        }

        public void setLast_rank(String last_rank) {
            this.last_rank = last_rank;
        }

        public String getTeam_id() {
            return team_id;
        }

        public void setTeam_id(String team_id) {
            this.team_id = team_id;
        }

        public String getClub_name() {
            return club_name;
        }

        public void setClub_name(String club_name) {
            this.club_name = club_name;
        }

        public String getMatches_total() {
            return matches_total;
        }

        public void setMatches_total(String matches_total) {
            this.matches_total = matches_total;
        }

        public String getMatches_won() {
            return matches_won;
        }

        public void setMatches_won(String matches_won) {
            this.matches_won = matches_won;
        }

        public String getMatches_draw() {
            return matches_draw;
        }

        public void setMatches_draw(String matches_draw) {
            this.matches_draw = matches_draw;
        }

        public String getMatches_lost() {
            return matches_lost;
        }

        public void setMatches_lost(String matches_lost) {
            this.matches_lost = matches_lost;
        }

        public String getGoals_pro() {
            return goals_pro;
        }

        public void setGoals_pro(String goals_pro) {
            this.goals_pro = goals_pro;
        }

        public String getGoals_against() {
            return goals_against;
        }

        public void setGoals_against(String goals_against) {
            this.goals_against = goals_against;
        }

        public String getPoints() {
            return points;
        }

        public void setPoints(String points) {
            this.points = points;
        }
    }


}
