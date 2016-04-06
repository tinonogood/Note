package CH9;

/**
 * Created by tino on 2016/3/25.
 */
public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolumeLevel(3);

        TV tv2 = new TV();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("Ch" + tv1.channel + "; Vol" + tv1.volumeLevel);
        System.out.println("Ch" + tv2.channel + "; Vol" + tv2.volumeLevel);
    }

}
