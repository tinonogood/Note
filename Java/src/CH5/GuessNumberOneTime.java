package CH5;

import java.time.Year;
import java.util.Scanner;

/**
 * Created by tino on 2016/3/12.
 */
public class GuessNumberOneTime {
    public static void main(String[] args) {
        //Produce random number
        int num = (int) (Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number 0~100: ");

        //Prompt the user to guess the number
        System.out.println("\nEnter your guess: ");
        int guess = input.nextInt();

        if (guess == num){
            System.out.print("Yes, the number is " + num);
        }
        while (guess != num) {
            if (guess > num) {
                System.out.println("\nBe Lesser! Enter your guess: ");
                guess = input.nextInt();
            }
            else{
                System.out.println("\nBe Bigger! Enter your guess: ");
                guess = input.nextInt();
            }
        }
        System.out.print("Yes");
    }
}
