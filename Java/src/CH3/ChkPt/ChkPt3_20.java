package CH3.ChkPt;

import java.util.Scanner;

/**
 * Created by Tino on 2016/2/26.
 */
public class ChkPt3_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //�ϥΪ̿�JX
        System.out.println("|x - 5 | < 4.5 ?? ; X = ");
        double a = input.nextDouble();

        //�P�_|x - 5 | < 4.5?
        if ((a-5) > 4.5 || 5 - a < 4.5)
            System.out.println("|" + a + " - 5 | < 4.5");
        else
            System.out.println("|" + a + " - 5 | > 4.5");
    }
}
