package CH5;

import java.util.Scanner;

/**
 * Created by tino on 2016/3/12.
 */
public class GuessNumber {
    public static void main(String[] args) {
        //Produce random number
        int num = (int) (Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number 0~100: ");

        //Prompt the user to guess the number
        System.out.println("\nEnter your guess: ");
        int guess = input.nextInt();
        int smallnum = 0;
        int bignum = 100;

        if (guess == num){
            System.out.print("Yes, the number is " + num);
        }
        while (guess != num) {
            if (guess > num){
                bignum = guess;
                System.out.println("No, Enter your guess(" + smallnum + " ~ " + guess + "): ");
                guess = input.nextInt();
            }
            else {
                smallnum = guess;
                System.out.println("\nNo, Enter your guess(" + guess + " ~ " + bignum + "): ");
                guess = input.nextInt();
            }
        }
        System.out.print("Yes");
}}
