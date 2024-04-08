package method_overriding;

class Employee
{
	public void print()
	{
		System.out.println("in Employee class");
	}
}

class HR extends Employee
{
	public void print()
	{
		System.out.println("in HR class");
	}
}

public class DriverClass
{
	public static void main(String[] args)
	{
		Employee e1=new HR();
		Employee e2=new Employee();
		
		e1.print(); // 
		e2.print(); // 
		
	}
}