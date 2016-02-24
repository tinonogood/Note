package CH2.CHKPT;

import java.util.Scanner;

/**
 * Created by Tino on 2016/2/24.
 */
public class ChkPt2_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter b: ");
        double b = input1.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter c: ");
        double c = input2.nextDouble();
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter d: ");
        double d = input3.nextDouble();
        Scanner input4 = new Scanner(System.in);
        System.out.print("Enter r: ");
        double r = input4.nextDouble();

        double Ans = 4/(3*(r+34)) - 9*(a+b*c)+(3+d*(2+a))/(a+b*d);
        System.out.print("Ans: " + Ans);
    }
}
