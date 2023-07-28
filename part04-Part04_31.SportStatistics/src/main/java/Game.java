public class Game {
    private String homeTeam;

    private String visitingTeam;

    private int homeTeamPoints;

    private int visitingTeamPoints;

    public Game(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
    }

    public boolean checkTeamName(String name) {
        if (this.homeTeam.equals(name) || this.visitingTeam.equals(name)) {
            return true;
        } else {
            return false;
        }
    }

    public int checkWinner(String name) {
        if (this.homeTeam.equals(name)) {
            if (homeTeamPoints > visitingTeamPoints) {
                return 1;
            } else if (homeTeamPoints < visitingTeamPoints) {
                return -1;
            } else {
                return 0;
            }
        } else if (this.visitingTeam.equals(name)) {
            if (visitingTeamPoints > homeTeamPoints) {
                return 1;
            } else if (visitingTeamPoints < homeTeamPoints) {
                return -1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
