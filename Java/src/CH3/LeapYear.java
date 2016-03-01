package CH3;

import java.util.Scanner;

/**
 * Created by Tino on 2/27/2016.
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year");
        int year = input.nextInt();

        //Check if the year is a leap year
        boolean isLeaper =
                (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);

        //Display result
        System.out.print(year + " is a leap year?" + isLeaper);
    }
}
