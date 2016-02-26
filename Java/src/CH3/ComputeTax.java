package CH3;

import java.util.Scanner;

/**
 * Created by Tino on 2016/2/26.
 */
public class ComputeTax {
    public static void main(String[] args) {
        //Creat a Scanner, 做Scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter filing state
        System.out.print("0:Single, 1: Married ,2: Married Separately, 3: Head");
        int status = input.nextInt();

        //Prompt the user to enter taxable income, 讓使用者輸入收入
        System.out.print("Enter taxable income");
        double income = input.nextDouble();

        //Compute tax
        double tax = 0;

        if (status == 0) {//Single
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            else if (income <= 82250)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            else if (income <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            else if (income <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;

        }
        else if (status == 1) {//Married
            if (income <= 16700)
                tax = income * 0.10;
            else if (income <= 67900)
                tax = 8350 * 0.10 + (income - 16700) * 0.15;
            else if (income <= 137050)
                tax = 8350 * 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
            else if (income <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            else if (income <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
        }
        else if (status == 2) {//Married

        }
        else if (status == 3) {//Married

        }
        else {
            System.out.print("Error");
        }

        System.out.println("Tax: " + (int)(tax * 100)/100.0);
    }
}
