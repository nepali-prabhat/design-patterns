package Factory;
import java.util.ArrayList;
import java.util.List;

public class Ships implements ISubject{
	Observer observer;
	private String name;
	private double hp;
	private int position;
	private double damage;
	
	 public Ships(String name, double hp, double damage,int position ) {
		 	this.name = name;
			this.hp = hp;
			this.damage = damage;
			this.position = position;
	 }
	 
	 
		public void setName(String name) {
			 this.name = name;
		}
		
		public String getName() {
			return this.name;
		}

		public void setDamage(double damage) {
			this.damage = damage;
		}
		public void setPosition(int position) {
			this.position = position;
		}
		public void setHp(double hp) {
			this.hp = hp;
		}
		public double getDamage() {
			return this.damage;
		}
		public double getPosition() {
			return this.position;
		}
		public double getHp() {
			return this.hp;
		}
		public void reduce_hp(double damage) {
			
			hp = (hp-damage>0)? hp-damage:0;
		}

		public void add_Observer(Observer newObserver) {
			observer = newObserver;
		}
		
		public void update() {
			observer.update(this);
		}
	
}
