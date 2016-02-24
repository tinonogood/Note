package CH2;

import java.util.Scanner;

/**
 * Created by Tino on 2016/2/24.
 */
public class ComputeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double, ex: 11.56: ");
        double amount = input.nextDouble();
        int remainingAmount = (int)(amount*100);
        int numberOfDollars = remainingAmount/100;
        remainingAmount = remainingAmount%100;
        int numberOfQuarters = (int)amount/25;
        remainingAmount = remainingAmount%25;
        int numberOfDime = remainingAmount/10;
        remainingAmount = remainingAmount%10;
        int numberOfNickle = remainingAmount/5;
        remainingAmount = remainingAmount%5;
        int numberOfPennies=remainingAmount;

        System.out.println("Your amount " + amount);
        System.out.println("Dollars " + numberOfDollars);
        System.out.println("Quarters " + numberOfQuarters);
        System.out.println("Dimes " + numberOfDime);
        System.out.println("Nickles " + numberOfNickle);
        System.out.println("Pennies " + numberOfPennies);
//        System.out.println("Your ount" + amount);
    }
}
