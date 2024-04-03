package array;

import java.util.HashSet;
import java.util.Set;

public class DistinctElementFromArray 
{
	public static int distinctElement(int[] arr)
	{
		int count=0;
//		for(int i=arr.length-1;0<=i;i--)
//		{
//			boolean flag=true;
//			for(int j=0;j<i;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					flag=false;
//					break;
//				}
//			}
//			
//			if(flag)
//				count++;
//			
//		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=true;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					flag=false;
					break;
				}
			}
			
			if(flag)
				count++;
			
		}
		
		return count;
	}
	
	public static int distinctElement2(int[] arr)
	{
		
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		return set.size();
	}
	
	
	public static void main(String[] args)
	{
		int[] arr= {5,1,1,1,1,1,5,1,1,2,2,5};
		
		System.out.println(distinctElement(arr));
	}
}
