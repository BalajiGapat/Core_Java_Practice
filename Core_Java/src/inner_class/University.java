package inner_class;

import java.util.ArrayList;
import java.util.List;

public class University 
{
    private String name;
    private List<Department> departments;
    

    public University(String name) 
    {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String name, int numStudents) 
    {
        this.departments.add(new Department(name, numStudents));
    }

    // Inner class
    private class Department 
    {
        private String name;
        private int numStudents;

        public Department(String name, int numStudents)
        {
            this.name = name;
            this.numStudents = numStudents;
        }

        @Override
        public String toString() 
        {
            return "Department{Name='" + name + "', NumStudents=" + numStudents + '}';
        }
    }

    public void printDepartments() 
    {
        for (Department dept : departments) 
        {
            System.out.println(dept);
        }
    }

    public static void main(String[] args) 
    {
        University university = new University("Global Tech University");
        university.addDepartment("Computer Science", 200);
        university.addDepartment("Electrical Engineering", 150);
        university.addDepartment("Mechanical Engineering", 120);

        university.printDepartments();
    }
}
