package CH2.CHKPT;

/**
 * Created by Tino on 2016/2/24.
 */
public class ChkPt2_23 {
    public static void main(String[] args) {
    long totalMS = System.currentTimeMillis();
    long totalS = totalMS/1000;
    long currentS = totalS%60;
    long totalM = totalS/60;
    long currentM = totalM%60;
    long totalHr = totalM/60;
    long currentHr = totalHr%24;
    System.out.println(currentHr+":"+currentM+":"+currentS+" GMT");
    }
}

