package CH5.ChkPt;
/**
 * Created by tino on 2016/3/16.
 */
public class ChkPt5_3 {
    public static void main(String[] args) {
        int i1 =1;
        while (i1<10) {
            if (i1 % 2 == 0)
                System.out.print(" i1:" + i1);
            i1++;
        }

        int i2 = 1;
        while (i2 < 10) {
            if (i2 % 2 == 0)
                System.out.print(" i2:" + i2++);
            i2++;
        }

        int i4 = 1;
        while (i4 < 10) {
            if (i4 % 2 == 0)
                System.out.print(" i4:" + ++i4);
            i4++;
        }
//
//        int i3 = 1;
        int i3 = 2;
        while (i3 < 10) {
            if ((i3++) % 2 == 0)
                System.out.print(" i3:" + i3);
            i3++;
        }

    }
}


