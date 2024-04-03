package string;

public class StringDemo 
{
	public static boolean isPanagram(String str) 
	{	
		if(str.length()<26)
			return false;
		
		str=str.toUpperCase();
		
		boolean arr[] = new boolean[26];

		for (int i = 0; i < 26; i++) 
		{
			char ch = str.charAt(i);
			
			if('A' <= ch && ch <= 'Z')
				arr[ch-'A']=true;
//			if ('a' <= ch && ch <= 'z' )
//				arr[ch - 'a'] = true;
			
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == false)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "abcdefghijklmnopqr tuvwxyz";
		System.out.println(isPanagram(str));
	}

}
