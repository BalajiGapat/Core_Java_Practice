package customException;

@SuppressWarnings("serial")
class CustomException extends Exception
{
	public CustomException(String e)
	{
		super(e);
	}
}


@SuppressWarnings("serial")
class CustomException2 extends Exception
{
	public CustomException2(String ex) 
	{
		super(ex);
	}
}

public class CustomExceptionDriver 
{
	public static void main(String[] args) throws CustomException2  
	{
		try 
		{
			throw new CustomException("custome Exception......!!!");	
		}
		catch(CustomException e)
		{
			e.printStackTrace();
			System.out.println();
		}
		
		//throw new CustomException2("CustomException2........!!!!");
		
	}
}
