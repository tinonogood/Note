package CH3.ChkPt;

/**
 * Created by tino on 2016/3/4.
 */
public class ChkPt3_31 {
    public static void main(String[] args) {
        int x =1, a = 3;
        switch (a){
            case 1: x += 5; break;
            case 2: x += 10; break;
            case 3: x += 15; break;
            case 4: x += 20;
        }
        System.out.print(x);
    }
}
