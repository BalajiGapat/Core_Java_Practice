package string;

import java.util.ArrayList;
import java.util.List;

public class PatternChecking 
{
	public static List<Integer> countPattern(String str, String pat)
	{
		List<Integer> list=new ArrayList<>();
		int pos=str.indexOf(pat);
		while(pos>=0)
		{
			list.add(pos);
			pos=str.indexOf(pat, pos+pat.length());
		}
			
		return list;
	}
	
	public static void main(String[] args) 
	{
		String str="geeks for geeks eeoj geeks oejieo geeks";
		String pat="geeks";
		System.out.println(countPattern(str, pat));
		
	}
}
