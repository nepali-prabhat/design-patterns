package Factory;
import java.util.Scanner;;
public class Simulate {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ShipFactory factory = new ShipFactory();
		Ships ship1 = null;
		int type;
		System.out.println("which level ship do you want to spawn 1/2/3");
		if(input.hasNextInt()) {
			type = input.nextInt();
			ship1 = factory.makeShip(type);
		}
		actions(ship1);
	}
	
	public static void actions(Ships ship) {
		System.out.println(ship.getName()+ " spawn at " + ship.getPosition());
		System.out.println(ship.getName() + "  has hp of " + ship.getHp());
		ship.reduce_hp(30);
		System.out.println(ship.getName() + " received damage of 30 ");
		System.out.println("It now has hp of " + ship.getHp());
	}

}
