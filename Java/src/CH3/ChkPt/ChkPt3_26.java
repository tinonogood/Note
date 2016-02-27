package CH3.ChkPt;

import java.util.Scanner;

/**
 * Created by Tino on 2/27/2016.
 */
public class ChkPt3_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // user enter weight & height
        System.out.println("Enter weight");
        double weight = input.nextDouble();
        System.out.println("Enter height");
        double height = input.nextDouble();

        //26
        if (weight > 50 || height > 60 )
            System.out.println("26_true");
        else
            System.out.println("F");

        //27
        if (weight > 50 && height > 60 )
            System.out.println("27_true");
        else
            System.out.println("F");

        //28
        if (weight > 75 ^ height > 65 )
            System.out.println("28_true");
        else
            System.out.println("F");

    }
}