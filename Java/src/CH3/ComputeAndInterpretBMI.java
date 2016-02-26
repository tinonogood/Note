package CH3;

import java.util.Scanner;

/**
 * Created by Tino on 2016/2/25.
 */
public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 使用者輸入體重(lb),身高(in)
        System.out.print("Enter weight in pounds");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches");
        double height = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        // 計算BMI
        double weightInKilograms = weight*KILOGRAMS_PER_POUND;
        double heightInMeters = height*METERS_PER_INCH;
        double bmi = weightInKilograms/(heightInMeters * heightInMeters);

        // 展示結果
        System.out.println("BMI is " +bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");




        /**
         * 註解動作
         * Scanner 放最前面
         * 宣告常數
        *System.out.println("How fat (lb)? ");
        *Scanner input = new Scanner(System.in);
        *double kg = input.nextDouble()*0.45359237;
        *System.out.println("How tall (inch)? ");
        *double m = input.nextDouble()*0.0254;
        8double bmi = kg/Math.pow(m,2);
        *System.out.println("BMI is " + (int)(bmi*100)/100.0);
        }
         */
    }
 }