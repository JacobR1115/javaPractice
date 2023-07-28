
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();
        ArrayList<Game> gameArrayList = new ArrayList<>();
        int counter = 0;

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();
                String[] parts = row.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);

                gameArrayList.add(counter, new Game(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
            }
        }
        System.out.println("Team:");
        String teamName = scan.nextLine();
        int numberOfGames = 0;
        int wins = 0;
        int losses = 0;
        for (Game game: gameArrayList) {
            if (game.checkTeamName(teamName)) {
                numberOfGames++;
            }
            if (game.checkWinner(teamName) == 1) {
                wins++;
            } else if (game.checkWinner(teamName) == -1) {
                losses++;
            }
        }
        System.out.println("Number of Games: " + numberOfGames);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
