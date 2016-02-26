package CH3.ChkPt;

import java.util.Scanner;

/**
 * Created by Tino on 2016/2/26.
 */
public class ChkPt3_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        if (a <= 100 && a >= 1)
            System.out.print("true");
        else
            System.out.print("F");
    }
}
