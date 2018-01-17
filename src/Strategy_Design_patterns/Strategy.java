package Strategy_Design_patterns;

public class Strategy {

	public static void main(String[] args) {
		Creature kitty = new Cat();
		Creature birdy = new Bird();
		Creature eagle =  new Bird();
		Creature spikey = new Dog();
		
		kitty.setName("kitty");
		birdy.setName("Birdy");
		spikey.setName("Spikey");	
		eagle.setName("Eagle");
		
		System.out.println("--------------");
		
		eagle.set_flying_nature(new FlyVeryFast());
		
		System.out.println(kitty.getName() + " says "+ kitty.get_flying_nature());
		System.out.println(birdy.getName() + " says "+birdy.get_flying_nature());
		System.out.println(spikey.getName() + " says "+spikey.get_flying_nature());
		System.out.println(eagle.getName() + " says "+eagle.get_flying_nature());
	}

}
