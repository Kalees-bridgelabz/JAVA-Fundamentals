package snakeladder;

import java.util.Random;

public class SnakeLadderTwoPlayer {
    public static void main(String[] args) {
        Random random = new Random();

        int player1Pos = 0;
        int player2Pos = 0;

        int currentPlayer = 1; // 1 = Player1, 2 = Player2
        int diceCount = 0;

        System.out.println("Snake & Ladder Game Started (2 Players)");
        System.out.println("Both players starting at position 0\n");

        while (player1Pos < 100 && player2Pos < 100) {

            diceCount++;

            int dice = random.nextInt(6) + 1;
            System.out.println("Turn " + diceCount + " -> Player " + currentPlayer + " rolled: " + dice);

            if (currentPlayer == 1) {
                int oldPos = player1Pos;
                int newPos = player1Pos + dice;

                if (newPos <= 100) {
                    player1Pos = newPos;
                }
                // Leader Logic
                if (player1Pos == 5) player1Pos = 58;
                else if (player1Pos == 14) player1Pos = 49;
                else if (player1Pos == 42) player1Pos = 60;
                else if (player1Pos == 53) player1Pos = 72;
                else if (player1Pos == 75) player1Pos = 94;
                else if (player1Pos == 64) player1Pos = 83;
                else player1Pos = player1Pos;

                //snake logic
                if (player1Pos == 38) player1Pos = 20;
                if (player1Pos == 45) player1Pos = 7;
                if (player1Pos == 51) player1Pos = 10;
                if (player1Pos == 76) player1Pos = 54;
                if (player1Pos == 91) player1Pos = 73;
                if (player1Pos == 97) player1Pos = 61;

                System.out.println("Player 1 position: " + player1Pos);

                // Check if ladder happened (extra turn)
                if (player1Pos > oldPos + dice) {
                    System.out.println("Player 1 got Ladder! Play again.\n");
                    continue;
                }

                // Switch player
                currentPlayer = 2;
                System.out.println();

            } else {
                int oldPos = player2Pos;
                int newPos = player2Pos + dice;

                if (newPos <= 100) {
                    player2Pos = newPos;
                }

                // Leader Logic
                if (player2Pos == 5) player2Pos = 58;
                else if (player2Pos == 14) player2Pos = 49;
                else if (player2Pos == 42) player2Pos = 60;
                else if (player2Pos == 53) player2Pos = 72;
                else if (player2Pos == 75) player2Pos = 94;
                else if (player2Pos == 64) player2Pos = 83;
                else player2Pos = player2Pos;

                //snake logic
                if (player2Pos == 38) player2Pos = 20;
                if (player2Pos == 45) player2Pos = 7;
                if (player2Pos == 51) player2Pos = 10;
                if (player2Pos == 76) player2Pos = 54;
                if (player2Pos == 91) player2Pos = 73;
                if (player2Pos == 97) player2Pos = 61;

                System.out.println("Player 2 position: " + player2Pos);

                // Check if ladder happened (extra turn)
                if (player2Pos > oldPos + dice) {
                    System.out.println("Player 2 got Ladder! Play again.\n");
                    continue;
                }

                // Switch player
                currentPlayer = 1;
                System.out.println();
            }
        }

        // Report Winner
        if (player1Pos == 100) {
            System.out.println("Winner: Player 1 won the game!");
        } else {
            System.out.println("Winner: Player 2 won the game!");
        }
    }
}
