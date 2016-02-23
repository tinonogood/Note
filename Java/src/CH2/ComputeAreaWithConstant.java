package CH2;

import java.util.Scanner;

/**
 * Created by Tino on 2016/2/23.
 */
public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double area = radius*radius*PI;

        System.out.println("Area: " + area);
    }
}
