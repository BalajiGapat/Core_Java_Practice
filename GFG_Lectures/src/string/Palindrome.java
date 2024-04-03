package string;

public class Palindrome 
{
	public static boolean isPalindrome(String str)
	{
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		String rev=sb.toString();
		return rev.equals(str);
	}
	
	
	
	
	public static boolean isPalindrome2(String str)
	{
		int i=0;
		while(i<=str.length()/2)
		{
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
				return false;
			i++;
		}
		return true;
	}
	
	
	public static boolean isPalindrome3(int num)
	{
		int rev=0;
		int temp=num;
		while(num>0) //123
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(temp==rev)
			return true;
		else
			return false;	
	}

	public static void main(String[] args)
	{
		String str="ABCDCBA";
		System.out.println("is string palindrome: " +isPalindrome2(str));
		
		int num=12321;
		System.out.println("is num palindrome: "+isPalindrome3(num));
		
	}

}
