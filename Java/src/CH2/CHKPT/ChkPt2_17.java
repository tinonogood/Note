package CH2.CHKPT;

import java.util.Scanner;

/**
 * Created by Tino on 2016/2/24.
 */
public class ChkPt2_17 {
    public static void main(String[] args) {
        System.out.println("Cal mr^2, m:");
//        int m =3;
//        int r =10;
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        System.out.println("r:");
        Scanner input1 = new Scanner(System.in);
        int r = input1.nextInt();
        double a = m * r * r;
        System.out.println(a);
    }
}
