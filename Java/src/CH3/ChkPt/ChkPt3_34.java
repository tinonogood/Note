package CH3.ChkPt;

import java.util.Scanner;

/**
 * Created by tino on 2016/3/4.
 */
public class ChkPt3_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("age?");
        int ages = input.nextInt();
        int ticketPrice = ( ages >= 16) ? 20 : 10;
        System.out.println("ticketPrice: " + ticketPrice);
    }
}
