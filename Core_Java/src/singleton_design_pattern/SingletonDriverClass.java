package singleton_design_pattern;

class Singleton
{
	// fields
    private int sId;
    private String sName;
    private String city;
    private long mobile;

    // Private static instance variable
    private static Singleton stud;
    

    // Private constructor
    private Singleton() 
    {
    	
    }

    // Static method to get the singleton instance
    public static Singleton getStud() 
    {
        if (stud == null) 
        {
            stud = new Singleton();
        }
        return stud;
    }

    // Setter method to update fields
    public void setStud(int sId, String sName, String city, long mobile) 
    {
        this.sId = sId;
        this.sName = sName;
        this.city = city;
        this.mobile = mobile;
    }

    @Override
    public String toString() 
    {
        return "SingletonClass [sId=" + sId + ", sName=" + sName + ", city=" + city + ", mobile=" + mobile + "]";
    }
}






public class SingletonDriverClass
{
	public static void main(String[] args) 
	{
		Singleton stud= Singleton.getStud();
		Singleton stud2= Singleton.getStud();
		System.out.println("stud:  "+stud.hashCode());
		System.out.println("stud2: "+stud2.hashCode());
		
		stud.setStud(123, "balaji", "pune", 9876543210L);
		System.out.println(stud);
	}
}
