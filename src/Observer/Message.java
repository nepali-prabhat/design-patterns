package Observer;

import java.util.List;

public interface Message{
	public List get_all_messages();
	public String get_last_message();
	public void delete_message(int index);
}