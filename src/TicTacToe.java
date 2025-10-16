public class TicTacToe {

    public static void main(String[] args) {
        String[][] board = new String[3][3];

//        Loops through the rows
        for (int r = 0; r < 3; r++) {
//            Loop through the columns in the current row
            for (int c = 0; c < 3; c++) {
                board[r][c] = "";
            }
        }
//        Play some moves
        board[1][1] = "X";
        board[0][0] = "O";
        board[2][0] = "X";
        board[2][1] = "O";
        board[0][2] = "X";

//        Display the board
        for (int r=0; r<3; r++) {
            for (int c =0; c < 3; c++) {
                System.out.print(board[r][c]);
                if (c < 2) System.out.print(" | ");
            }
            System.out.println();
            if (r < 2) System.out.println(" -  -  -  -  -  ");
        }
    }
}
