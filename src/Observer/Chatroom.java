package Observer;

public class Chatroom {
	public static void main(String[] args) {
		Manager Manish  = new Manager();
		Client Narayan  = new Client();
		Manish.add_Observer(Narayan);
		Manish.notice("Department will be closed tomorrow.");
		Manish.notice("Oopsis! its open again.");
		System.out.println(Narayan.get_all_messages());
		
		
	}
}
