package Observer;

public interface ISubject {
	public void add_Observer(Observer newObserver);
	public void remove_observer(Observer observer);
	public void notify_to_all();
	public void notify_to(Observer observer);
}
