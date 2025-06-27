package AdvancedOop.Player;

public class Person {
	double height;
	double weight;
	
	public Person() {
		this.height=10;
		this.weight=70;
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
