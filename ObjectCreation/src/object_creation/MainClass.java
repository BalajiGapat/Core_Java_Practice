package object_creation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Student implements Cloneable
{
	private int rollNo;
	private String name;
	private double percentage;
	
	public Student()
	{
		
	}
	
	Student(int rollNo, String name, double percentage) // default access modifier if not mentioned
	{
		this.rollNo=rollNo;
		this.name=name;
		this.percentage=percentage;
	}

	@Override
	public String toString() 
	{
		return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + "]";
	}

	// if we want to create a object an object through clone() method then 
	// overriding of this method is mandatory
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
	
	
		
}

public class MainClass 
{
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		//================ 1 ================//
		// creating object by using new key word
		Student std1=new Student(111, "Balaji", 66.25);
		System.out.println("std1: "+std1);
		
		
		
		
		
		
		//================ 2 ================//
		// creating object by using clone method of java.lang.Object class
		Student std2= (Student) std1.clone();
		System.out.println("std2: "+std2);
		System.out.println("std1.equals(std2): "+std1.equals(std2));
		System.out.println("std1==std2: "+(std1==std2) );

		//System.out.println("Class.forName(): "+Class.forName("object_creation.Student")); 
		// -- Returns the Class object associated with the class or interface with the given string name
		
		//System.out.println("std1.getClass(): "+std1.getClass()); 
		// -- Returns the runtime class of this Object.
		
		
		
		
		
		
		
		//================ 3 ================//
		//  creating an object by using Reflection API
		
		// 1. creating class object by using its fully qualified name
		Class<?> clazz= Class.forName("object_creation.Student");
		
		// 2. get the constructor of the class (assuming no argument constructor
		Constructor<?> constructor=clazz.getConstructor();
		
		// 3. make the constructor accessible if it is not public
		constructor.setAccessible(true);
		
		// 4. create an object of class by using constructor
		Student std3= (Student) constructor.newInstance();
		System.out.println("std3: "+std3);
		
	}
}
