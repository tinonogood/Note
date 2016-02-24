package CH2;

import java.util.Scanner;

/**
 * Created by Tino on 2016/2/23.
 */
public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter int for sec: ");
        int seconds = input.nextInt();

        int minutes = seconds/60;
        int remainingSeconds = seconds%60;
        System.out.println(minutes + ":" +remainingSeconds);
    }
}
