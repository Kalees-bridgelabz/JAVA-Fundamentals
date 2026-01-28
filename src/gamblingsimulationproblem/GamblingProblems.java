package gamblingsimulationproblem;

import java.util.Random;

public class GamblingProblems {
    static final int STAKE = 100;
    static final int BET = 1;
    static final int WIN_LIMIT = 150;
    static final int LOSS_LIMIT = 50;
    static final int DAYS = 20;


    public static void main(String[] args) {
        int totalAmount = 0;
        int winDays  = 0;
        int lossDays = 0;

        int maxProfit = Integer.MIN_VALUE;
        int maxLoss = Integer.MAX_VALUE;
        int luckiestDay = 0;
        int unluckiestDay = 0;
        int dailyResult = totalAmount - STAKE;

        for (int day = 1; day <= DAYS; day++) {
            int currentStake = STAKE;


            //UC 2 ==> win or loss posibilities
            Random rendom = new Random();
            while (currentStake > LOSS_LIMIT && currentStake < WIN_LIMIT) {
                int result = rendom.nextInt(2);
                if (result == 1) {
                    currentStake += BET;
                } else {
                    currentStake -= BET;
                }
            }
            if(currentStake == WIN_LIMIT){
                winDays++;
            }else{
                lossDays++;
            }
            System.out.println("currentStake " + currentStake);
            totalAmount += (currentStake - STAKE);

            if (dailyResult > maxProfit) {
                maxProfit = dailyResult;
                luckiestDay = day;
            }

            if (dailyResult < maxLoss) {
                maxLoss = dailyResult;
                unluckiestDay = day;
            }

        }

        System.out.println("totalAmount " + totalAmount);
        System.out.println("windays " + winDays);
        System.out.println("loss Days " + lossDays);
        System.out.println("luckiestDay " + luckiestDay);
        System.out.println("unluckiestDay " + unluckiestDay);

        if (totalAmount > 0) {
            System.out.println("Continue Gambling Next Month");
        } else {
            System.out.println("Stop Gambling");
        }
    }
}
