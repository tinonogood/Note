package CH2;

import java.util.Scanner;

/**
 * Created by Tino on 2016/2/24.
 */
public class FahrenheirToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter F: ");
        double F = input.nextDouble();

        double C = (5.0/9)*(F-32);
        System.out.println(F + "in F = " + C + "in C");
    }
}
