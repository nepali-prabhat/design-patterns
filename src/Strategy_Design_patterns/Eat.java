package Strategy_Design_patterns;

public class Eat {
	private int food_pyramind;
	public Eat(int hirarcy) {
		this.food_pyramind = hirarcy;
	}
	public String get_nature() {
		if(food_pyramind == 1) {
			return "vegeterian";
		}else if(food_pyramind == 2) {
			return "carnivorous";
		}else
			return "omnivorous";
	}
	
	public void setFoodPyramid(int hirarcy) {
		this.food_pyramind = hirarcy;
	}
}

