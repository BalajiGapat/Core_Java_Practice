package static_final_variable;

public class Employee 
{
	private static final String COM_NAME;
	private static int EMP_COUNT;
	private String empFirstName;
	private String empLastName;
	private final String empNumber;
	private static int NUM;
	
	static
	{
		COM_NAME="GeeksForGeeks";
		EMP_COUNT=0;
		NUM=101;
	}

	public Employee(String empFirstName, String empLastName) 
	{
		this.empNumber = empFirstName.substring(0, 3)+"-"+(NUM++);
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		EMP_COUNT++;
	}

	public static int getEMP_COUNT() 
	{
		return EMP_COUNT;
	}

	public static void setEMP_COUNT(int eMP_COUNT)
	{
		EMP_COUNT = eMP_COUNT;
	}

	public String getEmpFirstName() 
	{
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) 
	{
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() 
	{
		return empLastName;
	}

	public void setEmpLastName(String empLastName) 
	{
		this.empLastName = empLastName;
	}

	public static int getNUM() 
	{
		return NUM;
	}

	public static void setNUM(int nUM) 
	{
		NUM = nUM;
	}

	public static String getComName() {
		return COM_NAME;
	}

	public String getEmpNumber() 
	{
		return empNumber;
	}

		
	@Override
	public String toString() 
	{
		return "Employee [empFirstName=" + empFirstName + ", empLastName=" + empLastName + ", empNumber=" + empNumber
				+ ", Company Name: " +COM_NAME  + "]";
	}

	
	
	public static void main(String[] args) 
	{
		Employee emp1=new Employee("Balaji", "Gapat");
		System.out.println(emp1);
		Employee emp2=new Employee("Akash", "Jadhav");
		System.out.println(emp2);
		System.out.println("Total Employee Count: "+EMP_COUNT);
	}
}
