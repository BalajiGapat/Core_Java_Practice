package array;

public class CheckForSorted 
{
	public static boolean checkForSorted(int[] arr)
	{
		if(arr.length==0 || arr.length==1)
			return true;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]>arr[i])
				return false;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		int[] arr=new int[] {14,23,45,56,67};
		System.out.println("is sorted : "+checkForSorted(arr));
	}
}
