package exception;

public class CarException extends RuntimeException
{
	private static final long serialVersionUID = 921745559172626457L;

	public CarException(String errorMessage) 
	{
		super(errorMessage);
	}
}
