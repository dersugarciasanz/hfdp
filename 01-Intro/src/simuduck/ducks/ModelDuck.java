package simuduck.ducks;

import simuduck.behaviours.fly.FlyNoWay;
import simuduck.behaviours.quack.Quack;

public class ModelDuck extends Duck {
	
	
	public ModelDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model Duck");

	}

}
