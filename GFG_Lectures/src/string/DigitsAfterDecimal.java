package string;

public class DigitsAfterDecimal 
{
	public static String digitAfterDecimal(String str)
	{
		return str.substring(1+str.indexOf('.'));
	}
	
	public static void main(String[] args) 
	{
		String str="123.5435647027";
		System.out.println(digitAfterDecimal(str));
	}

}
