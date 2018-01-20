package Factory;

public class ShipFactory {
	
	public Ships makeShip(int type) {
		if(type ==1) {
			return new Ship_Level_1();
		} else if(type == 2) {
			return new Ship_Level_2();
		} else if(type==3) {
			return new Ship_Level_3();
		}else 
			return new Ship_Level_default();
		
	}
}
