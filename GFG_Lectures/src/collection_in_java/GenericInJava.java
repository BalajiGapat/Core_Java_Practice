package collection_in_java;

class Student <T, V>
{
	T roll;
	V name;
}


public class GenericInJava 
{
	public static<T> int count(T arr[], T obj)
	{
		int count=0;
		for(T e: arr)
		{
			if(e.equals(obj))
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) 
	{
		Student<Integer, String> stud=new Student<>();
		stud.roll=123;
		stud.name="Balaji";	
		System.out.println("count: "+count(new Integer[] {1,2,4,4,5}, 4));
	}
}
