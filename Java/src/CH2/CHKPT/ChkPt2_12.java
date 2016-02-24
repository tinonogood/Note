package CH2.CHKPT;

import java.util.Scanner;

/**
 * Created by Tino on 2016/2/23.
 */
public class ChkPt2_12 {
    public static void main(String[] args) {
        int day = 2;
        Scanner input = new Scanner(System.in);
        System.out.println("How many days after tue: ");
        int day2 = input.nextInt() + day;
        System.out.println(day2%7);
    }
}
