/**
 * Created by Casey on 2016/5/17.
 */
public class DuckTest {
    public static void main(String[] args) {
        MallarDuck duck1 =new MallarDuck();
        duck1.display();
        duck1.fly();
        PlasticDuck duck2 =new PlasticDuck();
        duck2.display();
        duck2.fly();
        DecoyDuck duck3 = new DecoyDuck();
        duck3.quack();
    }
}
