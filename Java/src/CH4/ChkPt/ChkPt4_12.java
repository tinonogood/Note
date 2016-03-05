package CH4.ChkPt;

/**
 * Created by tino on 2016/3/5.
 */
public class ChkPt4_12 {
    public static void main(String[] args) {
        char c = 'A';
        int i1 = (int)c;

        float f = 1000.34f;
        int i2 = (int) f;

        double d = 1000.34;
        int i3 = (int) d;

        int i = 97;
        char c1 = (char)i;

        System.out.print(i1 +" "+ i2 +" "+ i3 +" "+ c1);
    }
}
