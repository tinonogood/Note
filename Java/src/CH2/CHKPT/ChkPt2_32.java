package CH2.CHKPT;

import java.util.Scanner;

/**
 * Created by Tino on 2016/2/24.
 */
public class ChkPt2_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ax^2+bx+c=0 x=?");
        System.out.println("a=");
        double a = input.nextDouble();
        System.out.println("b=");
        double b = input.nextDouble();
        System.out.println("c=");
        double c = input.nextDouble();
        double x1= (-b+Math.pow(Math.pow(b,2)-4*a*c,0.5))/(2*a);
        double x2= (-b-Math.pow(Math.pow(b,2)-4*a*c,0.5))/(2*a);
        System.out.println("( "+x1+", "+ x2+")");

    }
}
