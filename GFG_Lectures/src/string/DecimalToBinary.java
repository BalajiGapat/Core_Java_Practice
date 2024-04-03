package string;

public class DecimalToBinary 
{
	public static void decimalToBinary(int num)
	{
		String str="";
		while(num>0)
		{
			str=str+num%2;
			num=num/2;
		}
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse());
	}
	
	
	public static void main(String[] args) 
	{
		int num=33;
		decimalToBinary(num);
		
	}
}
