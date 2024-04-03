package string;

public class BinaryToDecimal 
{
	public static int binaryToDecimal(String str)
	{
		int n=str.length()-1;
		int p=0;
		double num=0;
		while(n>=0)
		{
			num= num + Math.pow(2, p) * (str.charAt(n)-48);
			n--;
			p++;
		}
		
		
		return (int)num;
	}
	
	
	public static void main(String[] args) 
	{
		String str="100000"; 
		System.out.println(binaryToDecimal(str));
	}
}
