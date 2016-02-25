package CH3;

import java.util.Scanner;

/**
 * Created by Tino on 2016/2/24.
 */
public class AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis()%10);
        int number2 = (int)(System.currentTimeMillis()/7%10);

        Scanner input = new Scanner(System.in);
        System.out.println("what is " + number1 + "+" + number2 + "?");
        int answer = input.nextInt();
        System.out.println(number1+ "+"+ number2 + "=" + answer + "is" + (number1 + number2 == answer));
    }
}
