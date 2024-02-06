package lambda_expression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyClass 
{
	public static void main(String[] args) 
	{
		List<Integer> l1=Arrays.asList(10,20,30,40,50,60,70,80,90);
		l1.stream().map(i->i*2).forEach(i->System.out.print(i+"  "));
		
		System.out.println();
		
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		// list.forEach(i->System.out.print(i+"  "));
		
		list.stream() // making stream of list
			.filter(i->i%2==0) // filtering stream
			.map(i->i*i) // mapping
			.forEach(i->System.out.print(i+"  ")); // printing
		
		
		System.out.println("\n\n\n\n");
		// This is also Working
		list.stream()
			.map(i->i*i) 
			.filter(i->i%2==0) 
			.forEach(i->System.out.print(i+"  ")); 
	}
}
