package AdvancedOop.Player;

public class Person {
	private double height;
	private double weight;
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Person() {
		this.setHeight(10);
		this.weight=85;
	}
	
	public void walks() {
		this.weight*= 0.98;
		System.out.println("You lost weight!");
		System.out.printf("You weight: %.2f kg\n\n",this.weight);
	}
	
	public void eats() {
		this.weight *= 1.05;
		System.out.println("You gained weight!");
		System.out.printf("You weight: %.2f kg\n\n",this.weight);
	}
}
