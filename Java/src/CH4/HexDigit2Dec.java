package CH4;

import java.util.Scanner;

/**
 * Created by Tino on 2016/3/11.
 */
public class HexDigit2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();

        //Check hex has exactly one char
        if (hexString.length() != 1){
            System.out.print("Must one character");
            System.exit(1);
        }

        //Display decimal value
        char ch = hexString.charAt(0);
        if (ch <= 'F' && ch >= 'A'){
            int value = ch - 'A' + 10;
            System.out.print(ch + " is " + value);
        }
        else if (Character.isDigit(ch)){
            System.out.print(ch + " is " + ch);
        }
        else {
            System.out.print(ch + " is invalid ");
        }
    }
}
