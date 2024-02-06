package convert_map_into_list;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Student
{
	private int id;
	private String name;
	private double percentage;
	
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	
	
	
}


public class MapToList {
	public static void main(String[] args) {
		Map<String, Student> mp=new HashMap<>();
		mp.put("ABC-11", new Student(11, "Akash", 89.75));
		mp.put("ABC-22", new Student(22, "Saurabh", 75.75));
		mp.put("ABC-33", new Student(33, "Shubham", 88.75));
		mp.put("ABC-44", new Student(44, "Mauli", 68.75));
		
		Set<String> keys=mp.keySet();
		keys.stream().forEach(i->System.out.print(i+"  "));
		
		System.out.println("\n");
		
		Collection<Student> coll=mp.values();
		coll.stream().forEach(i->System.out.print(i+"  "));
		
		
		System.out.println("\n\nEntry Set:======>>>>>\n");
		Set<Entry<String, Student>> entitySet=mp.entrySet();
		entitySet.stream().forEach(i->System.out.print(i+"   "));
		
	}
}
