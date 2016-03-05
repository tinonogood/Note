package CH3.ChkPt;

/**
 * Created by tino on 2016/3/4.
 */
public class ChkPt3_32 {
    public static void main(String[] args) {
        int day = 5;
        String x = "string";
        switch (day){
            case 0: x = "Monday"; break;
            case 1: x = "Tue"; break;
            case 2: x = "Wes"; break;
            case 3: x = "Thu"; break;
            case 4: x = "Fri"; break;
            case 5: x = "Sat"; break;
            case 6: x = "Sun";
        }
        System.out.print(x);
    }
}
