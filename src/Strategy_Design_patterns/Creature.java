package Strategy_Design_patterns;

public class Creature {
		
	private int age;
	private String name;
	private int weight;
	private int  height;
	protected Eat nature_of_eating; 
	public Fly nature_of_flying;

	public void setWeight(int weight) {
		
		this.weight = (weight > 0)? weight: this.weight;
	}
	public int getWeight() {
		return weight;
	}

	public void setHeight(int height) {
		this.height = (height>0)? height:this.height;
	}
	public int getHeight() {
		return height;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	public String getName() {
		
		return name;
	}
	
	public void setAge(int age) {
		this.age=age>0? age : this.age;
	}
	public int getAge() {
		
		return age;
	}
		
	public void setNature(int nature) {
		this.nature_of_eating.setFoodPyramid(nature);
	}
	
	public void set_flying_nature(Fly newfly) {
		this.nature_of_flying = newfly;
	}
	public String get_flying_nature() {
		return nature_of_flying.try_to_fly();
	}
}
