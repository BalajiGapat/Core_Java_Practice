package string_classes;

public class StringBuilderClass 
{
	public static void main(String[] args) 
	{
		StringBuilder sb1=new StringBuilder("Hibernate");
		StringBuilder sb2=new StringBuilder("Hibernate");
		
		System.out.println(sb1.equals(sb2));
	}
}
