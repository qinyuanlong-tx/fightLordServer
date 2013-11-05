package igame;

public interface INotifer {
	void addListener(String eventName,IEventHandler handler);
}
