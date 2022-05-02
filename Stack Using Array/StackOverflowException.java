package exceptions;

@SuppressWarnings("serial")
public class StackOverflowException extends RuntimeException 
{
	public StackOverflowException(String message) 
	{
		super(message);
	}
}
