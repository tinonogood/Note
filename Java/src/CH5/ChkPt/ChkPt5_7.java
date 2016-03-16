package CH5.ChkPt;

import java.util.Scanner;

/**
 * Created by tino on 2016/3/16.
 */
public class ChkPt5_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number = 0;

        do {
            System.out.print("Enter an int (the input ends if it is 0): ");
            number = input.nextInt();
            sum += number;
        }while (number != 0);

        System.out.print(sum);
    }
}
