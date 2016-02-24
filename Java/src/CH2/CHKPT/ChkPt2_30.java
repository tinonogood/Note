package CH2.CHKPT;

import java.util.Scanner;

/**
 * Created by Tino on 2016/2/24.
 */

public class ChkPt2_30 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter purchase amount: ");
            double purchaseAmount = input.nextDouble();

            double tax = purchaseAmount * 0.06;
            System.out.println("tax: $" + (int) (tax * 100) / 100);
        }
    }


