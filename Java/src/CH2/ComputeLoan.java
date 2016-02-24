package CH2;

import java.util.Scanner;

/**
 * Created by Tino on 2016/2/24.
 */
public class ComputeLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Annual Interest Rate (%)");
        double annualInterestRate = input.nextDouble();
        System.out.println("Total years to pay;");
        double years = input.nextInt();
        System.out.println("Loan $");
        double Loan = input.nextInt();

        double monthlyInterestRate = annualInterestRate/(100*12);

        double monthlyPayment = Loan * monthlyInterestRate/ (1 - 1 / Math.pow( 1 + monthlyInterestRate,years*12));
//        System.out.println(monthlyPayment);
//        System.out.println(monthlyPayment*years*12);
        System.out.println((int)monthlyPayment*100/100.0);
        System.out.println((int)monthlyPayment*years*12*100/100.0);
    }
}
