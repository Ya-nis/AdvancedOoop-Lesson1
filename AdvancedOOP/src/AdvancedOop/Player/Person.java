package AdvancedOop.Player;

public class Person {
	private float height;
	private float weight;
	private String name; 
	
	public double getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public Person(String name, float weight) {
		this.name=name; 
		this.setHeight(10);
		this.weight= weight; 
	}
	
	public void walks() {
		this.weight*= 0.98;
		System.out.println(this.name+" lost weight!");
		System.out.printf(this.name+" weight: %.2f kg\n\n",this.weight);
	}
	
	public void eats() {
		this.weight *= 1.05;
		System.out.println(this.name+" gained weight!");
		System.out.printf(this.name+" weight: %.2f kg\n\n",this.weight);
	}
}
