/**
 * Created by Casey on 2016/5/17.
 */
public class RedheadDuck extends Duck implements Quackable,Flyable {


    public void quack() {
        System.out.print("Z Z");
    }

    @Override
    public void fly() {
        System.out.print("fly");
    }
}
