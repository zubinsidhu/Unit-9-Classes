//Lab9.2
public class StopWatch {

	long startTime = System.currentTimeMillis();
	long endTime = startTime;
	
	public StopWatch() {}
	
	public long getStartTime() { return startTime; }
	public long getEndTime() { return endTime; }
	public long getElapsedTime() { return endTime - startTime; }
	
	public void start() { startTime = System.currentTimeMillis(); }
	public void stop() { endTime = System.currentTimeMillis(); }
}