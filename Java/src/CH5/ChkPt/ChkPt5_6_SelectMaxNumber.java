package CH5.ChkPt;

import java.util.Scanner;

/**
 * Created by tino on 2016/3/16.
 */
public class ChkPt5_6_SelectMaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, max;
        System.out.print("Enter an int (the input ends if it is 0): ");
        number = input.nextInt();
        max = number;

        do {
            System.out.print("Enter an int (the input ends if it is 0): ");
            number = input.nextInt();
            if (number>max)
                max = number;
            System.out.println("the Max one is " + max);
        }while (number != 0);
    }
}
