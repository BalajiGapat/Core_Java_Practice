package static_block;

public class StaticBlock 
{
	private static String BANK_NAME;
	
	static
	{
		BANK_NAME="STATE BANK OF INDIA";
		System.out.println("in static block!!!");
	}
	
	public static void main(String[] args)
	{
		System.out.println("in main method...");
		System.out.println("bank name: "+BANK_NAME);
	}
	
}
