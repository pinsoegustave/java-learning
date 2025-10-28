import java.util.Arrays;

public class SortingPractice2 {
    public static void main(String[] args) {

        Player[] players = new Player[5];
        players[0] = new Player("Ronaldo");
        players[1] = new Player("Yamal");
        players[2] = new Player("Doue");
        players[3] = new Player("Ange");
        players[4] = new Player("Mbeumo");

//        Sort the players
        Arrays.sort(players); // Error: Java doesn't know how to compare values

//
//        Print the players
        for (Player p : players) {
            System.out.println(p);
        }



//        Player p = new Player("Gustave");
//        System.out.println(p);
    }
}
