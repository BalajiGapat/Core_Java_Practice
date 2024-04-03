package array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArray 
{
	public static void main(String[] args) 
	{	
		int[][] arr1={ {10,12}, {30,40}, {50, 60}, {70, 80} };
		
		int[][] twoDArray=new int[4][3];
		// arr2= {{1,2,3,4}, {5,6,7,8}}; // not allowed
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements: ");
		for(int i=0;i<twoDArray.length;i++)
		{
			for(int j=0;j<twoDArray[i].length;j++)
			{
				System.out.println("twoDArray["+i+"]["+j+"]=");
				twoDArray[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("============================");
		for(int[] arr : twoDArray)
			System.out.println(Arrays.toString(arr));
	}
}
