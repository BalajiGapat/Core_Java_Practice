package array;

class Emp
{
	private String name;
	private int id;
	
	public Emp() {
		super();
	}

	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}

public class EmpMain
{
	public static void main(String[] args) 
	{	
		Emp[] arr1=new Emp[] {new Emp(), new Emp()};
		
		Emp[] arr2=new Emp[2];
		arr2[0]=new Emp();
		arr2[1]=new Emp();
		
		Emp[] arr3=new Emp[3];
		for(int i=0;i<3;i++)
		{
			arr3[i]=new Emp();
		}	
	}
}
