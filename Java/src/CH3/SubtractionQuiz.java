package CH3;

import java.util.Scanner;

/**
 * Created by Tino on 2016/2/25.
 */
public class SubtractionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(Math.random()*10);
        int number2 = (int)(Math.random()*10);
        if (number1<number2){
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Num1: " + number1 + "; Num2: " +number2);
        System.out.print("num1-num2= ");
        boolean ans
                = number1-number2==input.nextInt();
    }
}
