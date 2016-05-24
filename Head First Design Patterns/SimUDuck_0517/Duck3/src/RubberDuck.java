/**
 * Created by Casey on 2016/5/17.
 */
public class RubberDuck extends Duck {

    public RubberDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    public void display(){
        System.out.println("RubberDuck");
    }
}
