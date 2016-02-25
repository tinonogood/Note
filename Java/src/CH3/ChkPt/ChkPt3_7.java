package CH3.ChkPt;

import java.util.Scanner;

/**
 * Created by Tino on 2016/2/25.
 * 敘述只有一個，可省封裝
 */
public class ChkPt3_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        if (number%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        if (number%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");

    }
}
