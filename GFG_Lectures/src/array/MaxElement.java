package array;

import java.util.Arrays;

public class MaxElement 
{
	public static int maxElement(int[] arr)
	{
		Arrays.sort(arr);
		
		return arr[arr.length-1];
	}
	
	
	public static void main(String[] args) 
	{
		int[] arr= {98,56,343,77,22,77,54};
		System.out.println("By Using Function Max:"+maxElement(arr));
		
		int max=Arrays.stream(arr).max().getAsInt();
		System.out.println("max: "+max);
	}
}
