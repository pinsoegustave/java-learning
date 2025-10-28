import java.util.Random;

public class Player implements Comparable<Player> {

//    Instance variables
    private String name;
    private int[] scores;

//    Constructor
    public Player(String argName) {
        name = argName;
        scores = new int[4];
        Random r = new Random();
        for (int i = 0; i < scores.length; i++) {
            scores[i] = r.nextInt(100);
        }
    }

//    Printing
    public String toString() {
        String display = name + ": ";
        for (int i = 0; i < scores.length; i++) {
            display += scores[i] + ", ";
        }
        return display;
    }

//    This tells Java how to compare two players. The current player with one passed in
    public int compareTo(Player otherPlayer) {
        int[] otherScores = otherPlayer.getScores();

        if (scores[0] < otherScores[0] ) return -1;
        else if (scores[0] > otherScores[0]) return 1;
        else return 0;


    }

//    Getters
    public int[] getScores() {
        return scores;
    }
}
