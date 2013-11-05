package core;

import igame.IEventHandler;
import igame.INotifer;

public class BaseController extends Notifier implements IEventHandler {

	protected String events[];
	
	@Override
	public void excute(String eventName, Object eventArgs) {
	}

	@Override
	public void registerEvents(String[] events,IEventHandler handler) {
		this.events = events;
		for(int i = 0 ; i < events.length ; i++)
		{
			addListener(events[i], handler);
		}
	}

}
