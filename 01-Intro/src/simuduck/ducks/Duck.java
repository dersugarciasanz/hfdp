package simuduck.ducks;

import simuduck.behaviours.fly.FlyBehaviour;
import simuduck.behaviours.quack.QuackBehaviour;

public abstract class Duck {
	
	protected FlyBehaviour flyBehaviour;
	protected QuackBehaviour quackBehaviour;
	
	
	public Duck() {
	}
	

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}

	public abstract void display();
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
}
