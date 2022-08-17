package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800,5,100);

        System.out.println("Your final score was: " + highScore);

        calculateScore(true,10000,8,200);

        // Relationship of global and non-global variable access is considered "Scope"
        int myLeaderboardlocation = calculateHighScorePosition(highScore);
        displayHighScorePosition("Davy",myLeaderboardlocation);

        myLeaderboardlocation = calculateHighScorePosition(900);
        displayHighScorePosition("Saly",myLeaderboardlocation);

        myLeaderboardlocation = calculateHighScorePosition(300);
        displayHighScorePosition("Henry",myLeaderboardlocation);

        myLeaderboardlocation = calculateHighScorePosition(90);
        displayHighScorePosition("Jen",myLeaderboardlocation);

    }

    //All code highlighted in orange are considered java Keywords

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        // In searching Algorithms "-1" is used as "invalid value" or "value not found"
        return -1;
    }
    public static void displayHighScorePosition(String playerName, int leaderboardPosition) {
        System.out.println(playerName + " managed to get in position " + leaderboardPosition + " on the leaderboard");

    }
    public static int calculateHighScorePosition(int score) {
        if (score >=1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        }
            return 4;
    }
//    Challenge

//    public static long toMilesPerHour(double kilometersPerHour) {
//
//        if (kilometersPerHour > 0) {
//            return -1;
//        }
//
//        return Math.round(kilometersPerHour / 1.609);
//
//
//    }
//    public static void printConversion(double kilometersPerHour) {
//        if(kilometersPerHour < 0) {
//            System.out.println("Invalid Value");
//        } else {
//            long milesPerHour = toMilesPerHour(kilometersPerHour);
//            System.out.println(kilometersPerHour + " km/h = " + milesPerHour +" mi/h");
//        }
//    }
}

