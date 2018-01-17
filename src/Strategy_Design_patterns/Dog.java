package Strategy_Design_patterns;

public class Dog extends Creature{
	public Dog() {
		super();
		nature_of_eating = new Eat(2);
		nature_of_flying = new CantFLy();
	}
	public void dig_a_hole() {
		System.out.println("dog just dug a hole");
	}
}
