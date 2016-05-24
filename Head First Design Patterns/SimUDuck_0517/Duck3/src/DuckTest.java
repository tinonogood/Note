/**
 * Created by Casey on 2016/5/17.
 */
public class DuckTest {
    public static void main(String[] args) {
        RubberDuck d1 = new RubberDuck();
        d1.performQuack();
        d1.performFly();
        d1.display();
        RedheadDuck d2 = new RedheadDuck();
        d2.performQuack();
        d2.performFly();
        d2.display();
        GreenheadDuck d3 = new GreenheadDuck();
        d3.performQuack();
        d3.performFly();
        d3.display();
    }
}
