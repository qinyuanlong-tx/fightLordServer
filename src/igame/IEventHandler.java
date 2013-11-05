package igame;

public interface IEventHandler {
	void registerEvents(String[] events,IEventHandler handler);
	void excute(String eventName,Object eventArgs);
}