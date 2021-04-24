package part4.file_and_reading_data.sport_statistics;

public class Game {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPts;
    private int visitingTeamPts;

    public Game(String homeTeam, String visitingTeam, int homeTeamPts, int visitingTeamPts){
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPts = homeTeamPts;
        this.visitingTeamPts = visitingTeamPts;
    }

    public String getHomeTeam(){
        return this.homeTeam;
    }

    public String getVisitingTeam(){
        return this.visitingTeam;
    }

    public int getHomeTeamPts(){
        return this.homeTeamPts;
    }

    public int getVisitingTeamPts(){
        return this.visitingTeamPts;
    }

    public boolean winnerIs(String team){
        if(team.equals(homeTeam) && homeTeamPts > visitingTeamPts){
            return true;
        }
        if(team.equals(visitingTeam) && visitingTeamPts > homeTeamPts){
            return true;
        }

        return false;

    }

}
