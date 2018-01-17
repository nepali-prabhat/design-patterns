package Strategy_Design_patterns;

public interface Fly {
	public String try_to_fly();
}

class CanFLy implements Fly{

	public String try_to_fly() {
		
		return "yay! I can fly!!";
	}
	
}
class CantFLy implements Fly{

	public String try_to_fly() {
		
		return "no! I can\"t fly!!";
	}
	
}
class FlyVeryFast implements Fly{

	public String try_to_fly() {
		
		return "wooo... i can fly real fast";
	}
	
}