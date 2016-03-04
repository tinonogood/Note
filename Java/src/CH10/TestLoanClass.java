package CH10;

import java.util.Scanner;

/**
 * Created by Tino on 2016/2/29.
 */
public class TestLoanClass {
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //Enter annual interest rate
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();

        //Enter number of years
        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        //Enter loan amount
        System.out.print("Enter loan amount, ex: 12000.54: ");
        double loanAmount = input.nextDouble();

        //Create a Loan object
        Loan loan =
                new Loan(annualInterestRate, numberOfYears, loanAmount);

        //Display loan date, monthly payment, and total payment
        System.out.printf("The loan was created on %s\n" + "The monthly payment is created on %.2f\nThe total payment is %.2f\n " , loan.getLoanDate().toString(), loan.getMonthlyPaymant(), loan.getTotalPayment());
    }

    /**
     * Created by Tino on 2016/2/29.
     */
    public static class Loan {
        private double annualInterestRate;
        private int numberOfYears;
        private double loanAmount;
        private java.util.Date loanDate;

        /** Default constructor */
        public Loan() {
            this (2.5, 1, 1000);
        }

        /** Construct a loan e/ specified annual interest rate, number of year, and loan amount */
        public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
            this.annualInterestRate = annualInterestRate;
            this.numberOfYears = numberOfYears;
            this.loanAmount = loanAmount;
            loanDate = new java.util.Date();
        }

        /** Return annualInterestRate */
        public double getAnnualInterestRate(){
            return annualInterestRate;
        }

        /** Set  a new annualInterestRate */
        public void setAnnualInterestRate(double annualInterestRate){
            this.annualInterestRate = annualInterestRate;
        }

        /** Return numberOfYears  */
        public double getNumOfYears(){
            return numberOfYears;
        }

        /** Set  a new umberOfYears */
        public void setNumberOfYears(int numberOfYears){
            this.numberOfYears = numberOfYears;
        }

        /** Return loanAmount */
        public double getLoanAmount(){
            return loanAmount;
        }

        /** Set  a new loanAmount */
        public void setLoanAmount(double annualInterestRate){
            this.loanAmount = loanAmount;
        }

        /** Find total payment  */
        public double getMonthlyPaymant(){
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1-(1/Math.pow(1+monthlyInterestRate, numberOfYears * 12)));
            return monthlyPayment;
        }

        /** Find total payment */
        public double getTotalPayment(){
            double totalPayment = getMonthlyPaymant() * numberOfYears * 12;
            return totalPayment;
        }

        /** Return loan date */
        public java.util.Date getLoanDate(){
            return loanDate;
        }
    }
}