package CH5;

import java.util.Scanner;

/**
 * Created by tino on 2016/3/16.
 */
public class SentineValue {
    public static void main(String[] args) {
//      Create Scanner
        Scanner input = new Scanner(System.in);

//        Read an initial data
        System.out.print("Enter a int (end if it is 0)");
        int data = input.nextInt();

//        Keep reading data until input = 0
        int sum = 0;
        while (data != 0 ){
            sum += data;

//            Read the next data
            System.out.print("Enter a int (end if it is 0)");
            data = input.nextInt();
        }

        System.out.println(sum);
    }
}
