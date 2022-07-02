import java.util.*;
public class Panagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean b=isPanagram(s.toLowerCase());
		System.out.println(b);
	}
		public static boolean isPanagram(String s)
		{
			if(s.length()<26)
			{
				return false;
			}
			else
			{
				for(char ch='a';ch<='z';ch++)
				{
					if(s.indexOf(ch)<0)
					{
						return false;
					}
				}
			}
			return true;
		}

	}


