package exceptions;

@SuppressWarnings("serial")
public class QueueException extends RuntimeException 
{
	public QueueException(String message) 
	{
		super(message);
	}
}
