package CH3.ChkPt;

/**
 * Created by tino on 2016/3/4.
 */
public class ChkPt3_36 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()%2 == 0 ? -1 : 1);
        System.out.print(Math.random()%2 == 0 ? -1 : 1);
    }
}
