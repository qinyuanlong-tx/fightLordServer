package core;

import igame.IEventHandler;
import igame.INotifer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

public class Notifier implements INotifer{
	
	public static String USER_READY_EVENT = "user_ready";
	
	public static String User_SIT_EVENT = "user_sit";
	
	public static String USER_ENTER_EVENT = "user_enter";
	
	private static final Map<String,Vector<IEventHandler>> eventListeners = new HashMap<String, Vector<IEventHandler>>();
	
	@Override
	public void addListener(String eventName, IEventHandler handler) {
		Vector<IEventHandler> handlers;
		if(eventListeners.get(eventName) == null)
		{
			handlers = new Vector<IEventHandler>();
		}
		else
		{
			handlers = eventListeners.get(eventName);
			handlers.add(handler);
		}
	} 
	
	public void sendEvent(String eventName,Object eventArgs)
	{
		Vector<IEventHandler> handlers = eventListeners.get(eventName);
		for(Iterator<IEventHandler> it = handlers.iterator() ; it.hasNext();)
		{
			IEventHandler handler = it.next();
			handler.excute(eventName, eventArgs);
		}
	}
	
}
