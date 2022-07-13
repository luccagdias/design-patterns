package strategy.duck;

import strategy.duck.behaviors.fly.FlyNoWay;
import strategy.duck.behaviors.quack.Squeak;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.quackBehavior = new Squeak();
        this.flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Displaying model duck");
    }
}
