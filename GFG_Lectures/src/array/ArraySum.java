package array;

import java.util.Arrays;

public class ArraySum 
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5};
		System.out.println("Array avg:"+Arrays.stream(arr).average());
		System.out.println("array sum"+Arrays.stream(arr).sum());
	}

}
