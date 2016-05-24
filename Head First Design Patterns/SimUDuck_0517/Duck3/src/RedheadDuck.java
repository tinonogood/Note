/**
 * Created by Casey on 2016/5/17.
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("RedheadDuck");
    }
}
