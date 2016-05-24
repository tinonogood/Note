/**
 * Created by Casey on 2016/5/17.
 */
public class GreenheadDuck extends Duck {

    public GreenheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("GreenheadDuck");
    }
}
