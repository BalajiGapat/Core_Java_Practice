package array;

public class ArrayDeclaration
{
	public static  boolean flag;
	
	public static void main(String[] args) 
	{	
		int[] arr1; // array declaration arr1 is stored in stack memory
		arr1=new int[5]; // array initialization 5 memory location are assign to array and its default values are 0
		
		int[] arr2=new int[5];
		
		int arr3[]=new int[5];
		
		int[] arr4= {1,2,3,4,5};
		
		int[] arr5=new int[] {1,2,3,4,5};
	
		int[] arr6, arr7;
		arr6=new int[5];
		arr7=new int[15];
	
		System.out.println(flag);
	}
}
