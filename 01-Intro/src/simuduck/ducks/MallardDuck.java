package simuduck.ducks;

import simuduck.behaviours.fly.FlyWithWings;
import simuduck.behaviours.quack.Quack;

public class MallardDuck extends Duck {
	
	
	public MallardDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");

	}

}
