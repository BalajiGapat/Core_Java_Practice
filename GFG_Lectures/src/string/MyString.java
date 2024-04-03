package string;

import java.util.Arrays;

public class MyString 
{
	public static void main(String[] args) 
	{
		char[] arr={'B','A','L','A','J','I'};
		//System.out.println(Arrays.toString(arr));
	
		String name="Balaji321Gapat54";
		int sum=0;
		for(int i=0;i<name.length();i++)
		{
			if(Character.isDigit(name.charAt(i)))
				sum=sum+(int)name.charAt(i)-48;		
		}
		System.out.println("sum: "+sum);
	
		String str="Balaji_Gapat_Maharashtra";
		System.out.println(str.substring(7));
		System.out.println(str.substring(7, 12));
		System.out.println("contains(): "+str.contains("Maha"));
		
		System.out.println(str.indexOf('G'));
		System.out.println(str.indexOf("Maha"));
		System.out.println(str.indexOf("ra", 20));
		System.out.println("last indecx"+str.lastIndexOf('h'));
	}
}
