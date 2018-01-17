package Factory;

public class Ship_Level_default extends Ships {
	
	public Ship_Level_default() {
		super("Default Ship", 0.0, 0.0, 0);
		Ships.update();
	}
}
