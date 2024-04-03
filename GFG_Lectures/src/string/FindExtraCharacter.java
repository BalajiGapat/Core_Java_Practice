package string;

import java.util.Arrays;

public class FindExtraCharacter 
{
	public static void findExtraChar(String str1, String str2)
	{
		str1.toLowerCase();
		str2.toLowerCase();
		int maxLen=Math.max(str1.length(), str2.length());
		int minLen=Math.min(str1.length(), str2.length());
		int[] arr=new int[maxLen];
		for(int i=0;i<minLen;i++)
		{
			arr[str1.charAt(i)-'a']++;
			arr[str2.charAt(i)-'a']--;
		}
		arr[str2.charAt(maxLen)-'a']++;
		int sum=Math.abs(Arrays.stream(arr).sum());
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args) 
	{
		String str1="abcdZ";
		String str2="abcdZT";
		
		int[] arr1= str1.chars().toArray();
		int[] arr2= str2.chars().toArray();
		
		int sum1=Arrays.stream(arr1).sum();
		int sum2=Arrays.stream(arr2).sum();
		int diff=Math.abs(sum1-sum2);
		char ch=(char)diff;
		System.out.println(ch);
		
		findExtraChar(str1, str2);
	}
}
