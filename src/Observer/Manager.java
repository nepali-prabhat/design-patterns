package Observer;

import java.util.ArrayList;
import java.util.List;

public class Manager implements ISubject{
	
	List<Observer> observer = new ArrayList<Observer>();
	private String message;
	
		public void add_Observer(Observer newObserver) {
			observer.add(newObserver);
		}
	
		public void remove_observer(Observer observer) {
			this.observer.remove(observer);
		}

		public void notify_to_all() {
			for(Observer x : observer) {
				x.update(message);
			}
		}
		public void notify_to(Observer observer) {
			int index = this.observer.indexOf(observer);
			this.observer.get(index).update(message);
		}
		
		public void notice(String message) {
			this.message = message;
			notify_to_all();
		}
		public String get_notice() {
			return this.message;
		}
		
		
}
