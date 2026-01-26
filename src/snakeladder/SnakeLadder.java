package snakeladder;

import java.util.Random;

public class SnakeLadder {
    public static void main(String[] args) {
        Random random = new Random();
        int position = 0;
        // initialize dice count initially Zero
        int diceCount = 0;

// Single player Start With Zero
        while (position < 100) {
            int dice = random.nextInt(6) + 1;
            //once roll the dice then we need to add our rolling dice count
            diceCount++;
            System.out.println("Roll " + diceCount + " -> Dice: " + dice);

            // start with Zero
            if (position + dice <= 100) {
                System.out.println("position " + position);
                position += dice;
            }else {
                System.out.println("Move ignored (crossing 100)");
            }
            System.out.println("Position after roll: " + position);
            System.out.println("------------------------");

            // Leader Logic
            if (position == 5) position = 58;
            else if (position == 14) position = 49;
            else if (position == 42) position = 60;
            else if (position == 53) position = 72;
            else if (position == 75) position = 94;
            else if (position == 64) position = 83;
            else position = position;

            //snake logic
            if (position == 38) position = 20;
            if (position == 45) position = 7;
            if (position == 51) position = 10;
            if (position == 76) position = 54;
            if (position == 91) position = 73;
            if (position == 97) position = 61;


        }

        if (position == 100)
            System.out.println("🎉 You won the game!");

        // this is the result of how many times of rolls dice
        System.out.println("Total dice rolls to win: " + diceCount);
    }
}
