package core;

public class Application {
	
	private static final Application _app = new Application();
	
	private Application()
	{
		
	}
	
	public static Application getInstance()
	{
		return _app;
	}
	
	private void startApplication()
	{}
	
	private void startSession()
	{}
	
	private void endSession()
	{}
	
	private void startGame()
	{}
	
	private void endGame()
	{}
	
	private void endApplication()
	{}
	
	public void sendEvent(String eventName,Object eventArgs)
	{
		
	}

}
