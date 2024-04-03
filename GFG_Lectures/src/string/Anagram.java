package string;

import java.util.Arrays;

public class Anagram 
{
	public static void anagram(String str1, String str2)
	{
		int[] arr1=str1.chars().toArray();
		int[] arr2=str2.chars().toArray();
		int sum1=Arrays.stream(arr1).sum();
		int sum2=Arrays.stream(arr2).sum();
		
		if(sum1-sum2==0)
			System.out.println("anagram!!!");
		else
			System.out.println("not anagram!!!");
	}
	
	public static boolean anagram2(String str1, String str2)
	{
		if(str1.length()!=str2.length())
			return false;
		int[] arr=new int[256];
		
		for(int i=0;i<str1.length();i++)
		{
			arr[str1.charAt(i)]++;
			arr[str2.charAt(i)]--;
		}
		
		int sum=Arrays.stream(arr).sum();
		if(sum==0)
			return true;
		else
			return false;
	}
	
	
	
	public static void main(String[] args)
	{
		String str1="abcd";
		String str2="cdabw";
		anagram(str1, str2);
		System.out.println(anagram2(str1, str2));
	}
}
