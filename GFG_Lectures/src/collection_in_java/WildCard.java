package collection_in_java;

import java.util.ArrayList;

class Emp 
{
	
}

class ManagerEmp extends Emp
{
	
}

public class WildCard 
{
	public static void main(String[] args) 
	{
		ArrayList<? extends Emp> emp1=new ArrayList<>();
		ArrayList<ManagerEmp> emp2=new ArrayList<>();
		emp1=emp2;
	}
}
