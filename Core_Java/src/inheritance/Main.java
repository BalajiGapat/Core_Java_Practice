package inheritance;


class Employee
{
    private String name;
    private int empId;
    private int basicSal;

    public Employee(String name, int empId, int basicSal)
    {
        this.name=name;
        this.empId=empId;
        this.basicSal=basicSal;
    }

    public void print()
    {
        System.out.println("in Employee class");
    }

}

class HR extends Employee
{
    private String department;
    private int bonus;

    public HR(String name, int empId, int basicSal, String department, int bonus)
    {
        super(name, empId,basicSal);
        this.department=department;
        this.bonus=bonus;
    }

    public void display()
    {
        System.out.println("in HR class");
    }
}


public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Java Backed Development Course...!!!");
        Employee hr=new HR("balaji", 123, 45000, "Development", 5000);
        hr.print();
         // hr.display(); // parent class reference cannot access child class property
        //((HR) hr).display(); // down casting
        
        HR hr2=new HR("Akash", 123, 45000, "Sales", 5000);
        hr2.print(); // upcasting => child class reference can access parent class property
        hr2.display();
    }
}