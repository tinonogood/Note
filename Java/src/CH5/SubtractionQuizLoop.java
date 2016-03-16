package CH5;

import java.util.Scanner;

/**
 * Created by tino on 2016/3/16.
 */
public class SubtractionQuizLoop {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5; //# of questions
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " "; // output string is initially empty
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS){
            //1. Gen 2 random number
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);

            //2. 2>1, swap
            if (number1 < number2 ){
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            //3. Prompt the user to answer
            System.out.print(number1 + " - " + number2 + "? ");
            int answer = input.nextInt();

            //4. Grade
            if (number1 - number2 ==answer){
                correctCount++;
            }
            else;
                count++;

            output += "\n" + number1 + " - " + number2 + "=" + answer + ((number1 - number2 == answer)?" Y":" N");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct: " + correctCount + "\nTest Time: " + testTime/1000 + " sec\n" + output);
    }
}
