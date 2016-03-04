package CH3.ChkPt;

/**
 * Created by tino on 2016/3/3.
 */
public class ChkPt3_30 {
    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        switch (x + 3){
            case 6: y=1;
            default: y += 1;
        }
        System.out.print(y);
    }
}