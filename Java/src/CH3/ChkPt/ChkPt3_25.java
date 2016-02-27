package CH3.ChkPt;

import java.util.Scanner;

/**
 * Created by Tino on 2/27/2016.
 */
public class ChkPt3_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age >= 13 && age <= 18)
            System.out.print("true");
        else
            System.out.print("F");


    }
}
