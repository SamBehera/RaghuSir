package StringProgram;
/*16.	WAP to define a method to return if a given string is Pangram*/
import java.util.Scanner;
public class Panagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string.");
		String st=sc.nextLine();
		boolean ans=isPanagram(st);
		if(ans==true)
			System.out.println("Is pangram");
		else
			System.out.println("Is not Pangram");
	}

	static boolean isPanagram(String str) {
		if(str.length()<26)
			return false;

		/*		int count[]=new int[26];
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>='A' && ch<= 'Z')
				count[ch-65]++;
			else if(ch>='a' && ch<='z')
				count[ch-97]++;
		}
		for(int i=0;i<26;i++) {
			if(count[i]==0)
				return false;
		}
		return true;
		 */ //ALTERNATIVE
		str=str.toLowerCase();
		for(char ch='a'; ch<='z'; ch++) {
			if (str.indexOf(ch)==-1)
				return false;
		}
		return true;
	}
}
