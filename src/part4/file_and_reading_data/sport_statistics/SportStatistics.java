package part4.file_and_reading_data.sport_statistics;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scanner.nextLine();
        ArrayList<Game> games = readFromFile(fileName);
        System.out.println("Team:");
        String teamName = scanner.nextLine();

        // Count only the matches of the specified team
        ArrayList<Game> gamesOfATeam = new ArrayList<>();
        for (Game game : games) {
            if (teamName.equals(game.getHomeTeam()) || teamName.equals(game.getVisitingTeam())) {
                gamesOfATeam.add(game);
            }
        }

        // print the number of games
        System.out.println("Games: " + gamesOfATeam.size());

        int wins = 0;
        for(Game game : games){
            if(game.winnerIs(teamName)){
                wins++;
            }
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (gamesOfATeam.size() - wins));



    }
    public static ArrayList<Game> readFromFile(String file){
        ArrayList<Game> games = new ArrayList<>();
        try(Scanner fileReader = new Scanner(Paths.get("src/part4/file_and_reading_data/sport_statistics/"+file))){
            while(fileReader.hasNextLine()){
                String row = fileReader.nextLine();
                String[] parts = row.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPts = Integer.valueOf(parts[2]);
                int visitingTeamPts = Integer.valueOf(parts[3]);

                games.add(new Game(homeTeam, visitingTeam, homeTeamPts, visitingTeamPts));

            }
        }catch (Exception e){
            System.out.println("Reading the file failed.");
        }
        return games;
    }
}
