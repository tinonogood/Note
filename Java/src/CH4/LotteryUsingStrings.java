package CH4;

import java.util.Scanner;

/**
 * Created by tino on 2016/3/12.
 */
public class LotteryUsingStrings {
    public static void main(String[] args) {
        //Generate a lottery as a two-digit string
        String lottery = "" + (int)(Math.random()*100);

        //Prompt the User to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick(two digit): ");
        String guess = input.nextLine();

        //Get digits from lottery
        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        //Get digits from guess
        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        System.out.println("Lottery number is " + lottery);

        //Check guess
        if (guess.equals(lottery))
            System.out.println("Exact: Win $10,000");
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: Win $3,000");
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digits: Win $1,000");
        else
        System.out.println("No match");
    }
}
