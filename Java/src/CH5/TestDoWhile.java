package CH5;

import java.util.Scanner;

/**
 * Created by tino on 2016/3/16.
 */
public class TestDoWhile {
    public static void main(String[] args) {
        int data;
        int sum = 0;

        Scanner input = new Scanner(System.in);

//        Keep reading data until the input = 0
        do {
//            Read the next data
            System.out.print("Enter an int (the input ends if it is 0): ");
            data = input.nextInt();

            sum += data;
        }while (data != 0 );

        System.out.print(sum);
    }
}
