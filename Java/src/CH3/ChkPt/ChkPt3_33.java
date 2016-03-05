package CH3.ChkPt;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by tino on 2016/3/4.
 */
public class ChkPt3_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        System.out.println((x<y && y<z) ? "sorted" : "not sorted");
    }
}
