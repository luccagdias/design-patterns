package strategy.duck;

import strategy.duck.behaviors.fly.FlyWithWings;
import strategy.duck.behaviors.quack.Squeak;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.quackBehavior = new Squeak();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Displaying mallard duck");
    }
}
