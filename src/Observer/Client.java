package Observer;

import java.util.ArrayList;
import java.util.List;

public class Client implements Observer, Message{

	private List<String> message = new ArrayList<String>();
	
		public void update(String message) {
			this.message.add(message);
		}
		
		public List get_all_messages() {
			return this.message;
		}
		
		public String get_last_message() {
			return this.message.get(message.size()-1);
		}
		
		public void delete_message(int index) {
			if(index<message.size()&& index>=0) {
				message.remove(index);
			}
		}
}
