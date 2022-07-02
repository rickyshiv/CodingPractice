
import java.util.HashSet;
public class LongestSubString {

	public static void main(String[] args) {
		String str=" ";
		longest(str);
		
	}
	private static String longest(String str)
	{
		HashSet<Character> set=new HashSet();
		String overall=" ";
		String Longest=" ";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(set.contains(c))
			{
				Longest=" ";
				set.clear();
			}
		
		  set.add(c);
		  Longest+=c;
		}
		  if(Longest.length()>overall.length())
		  {
			  overall=Longest;
		  }
		
		return overall;
	}
}
		

