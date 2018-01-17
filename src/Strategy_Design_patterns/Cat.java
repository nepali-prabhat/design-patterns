package Strategy_Design_patterns;

public class Cat extends Creature{
	
	public Cat() {
		super();
		nature_of_eating = new Eat(3);
		nature_of_flying = new CantFLy();
	}
	
	public void woon() {
		System.out.println("Woon... woon... i play with you");
	}
	
}
