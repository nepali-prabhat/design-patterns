package Strategy_Design_patterns;

public class Bird extends Creature {

	public Bird() {
		super();
		nature_of_eating = new Eat(1);
		nature_of_flying = new CanFLy();
	}
	

	
	


}
