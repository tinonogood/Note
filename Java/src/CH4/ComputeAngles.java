package CH4;

import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * Created by tino on 2016/3/4.
 */
public class ComputeAngles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //User enter three points
        System.out.print("Enter 3 points: (x1,y1,x2,y2,x3,y3)");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        //Compute three sides
        double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 -y3) * (y2 -y3));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 -y3) * (y1 -y3));
        double c = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 -y1) * (y2 -y1));

        //Compute three angle
        double A = Math.toDegrees(Math.acos((a*a - b*b - c*c)/(-2 * b * c)));

        //Display result
        System.out.println("Angle a is " + Math.round(A *100)/100.0);
    }
}
