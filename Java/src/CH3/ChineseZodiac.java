package CH3;

import java.util.Scanner;

/**
 * Created by tino on 2016/3/4.
 */
public class ChineseZodiac {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        //Case
        switch (year % 12) {
            case 0:
                System.out.println("Monkey");
                break;
            case 1:
                System.out.println("Monkey");
                break;
            case 2:
                System.out.println("Monkey");
                break;
            case 3:
                System.out.println("Monkey");
                break;
            case 4:
                System.out.println("Monkey");
                break;
            case 5:
                System.out.println("Monkey");
                break;
            case 6:
                System.out.println("Monkey");
                break;
            case 7:
                System.out.println("Monkey");
                break;
            case 8:
                System.out.println("Monkey");
                break;
            case 9:
                System.out.println("Monkey");
                break;
            case 10:
                System.out.println("Monkey");
                break;
            case 11:
                System.out.println("Monkey");
        }
    }
}