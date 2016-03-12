package CH5;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Scanner;

/**
 * Created by tino on 2016/3/12.
 */
public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);

        //Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("What is " + number1 + " + " + number2 + "?");
        int answer = input.nextInt();

        while (number1 + number2 != answer){
            System.out.println("Wrong!! What is " + number1 + " + " + number2 + "?");
            answer = input.nextInt();
        }

        System.out.println("O");
    }
}
