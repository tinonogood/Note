package CH2.CHKPT;

import java.util.Scanner;

/**
 * Created by Tino on 2016/2/24.
 */
public class ChkPt2_22_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r: ");
        double r = input.nextDouble();
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter t: ");
        double t = input1.nextDouble();

        double Ans = 5.5*Math.pow(r+2.5, 2.5+t);
        System.out.print("Ans: " + Ans);
    }
}
