package Question2Circular;

public interface CircularQueueIntf {

	public void addQ(int element) throws CiQueueException;
	public int deleteQ() throws CiQueueException;
	public boolean isEmpty();
	public boolean isFull();
	
}
