import java.util.*;
public class OccurencesFifthAlternateSolutions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int initial=str.length();
		Scanner sc1=new Scanner(System.in);
		String str1=sc1.next();
		str=str.replace(str1,"");
		int finalL=str.length();
		System.out.println("ocuurences in"+str+(initial-finalL));
		

	}

}
