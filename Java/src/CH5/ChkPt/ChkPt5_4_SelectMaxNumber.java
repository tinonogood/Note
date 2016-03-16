package CH5.ChkPt;

import java.util.Scanner;

/**
 * Created by tino on 2016/3/16.
 */
public class ChkPt5_4_SelectMaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, max;
        number = input.nextInt();
        max = number;

        while (number != 0){
            number = input.nextInt();
            if (number>max)
                max = number;
        }

        System.out.println("max: " + max);
        System.out.println("number: " + number);
    }
}
