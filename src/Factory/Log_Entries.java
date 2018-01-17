package Factory;

public class Log_Entries implements Observer{
	private Ships ship;
	private double hp;
	private int position;
	private double damage;
	
	public Log_Entries() {
		ship = new Ship_Level_default();
	}
		public void update(Ships ship) {
			this.ship = ship;
		}
		
		public void setHP() {
			
		}
	
}
