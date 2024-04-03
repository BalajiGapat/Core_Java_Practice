package array;

import java.util.Arrays;

public class StreamAPIWithArrayClass 
{
	public static void main(String[] args) 
	{
		long[] arr= {1,2,3,9,8,7,6,5,4};
		
		long max=Arrays.stream(arr).max().getAsLong();
		
		long min=Arrays.stream(arr).min().getAsLong();
		
		double avg=Arrays.stream(arr).average().getAsDouble();
	 
		long[] squares=Arrays.stream(arr).map(num->num*num).toArray();
		//Arrays.stream(arr).map(i->i*i).forEach(j->System.out.println(j));
		System.out.println(Arrays.toString(squares));
	
		long[] evens=Arrays.stream(arr).filter(i->i%2==0).toArray();
		System.out.println(Arrays.toString(evens));
	}
}
