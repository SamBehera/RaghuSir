package StringProgram;
/*17.	WAP to define a method to verify if the string is anagram*/
import java.util.Scanner;
public class AnagramCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 strings.");
		String st1=sc.nextLine();
		String st2=sc.nextLine();
		boolean rs=isAnagram(st1, st2);
		if(rs)
			System.out.println("String is Anagram");
		else
			System.out.println("String is not Anagram");
	}

	private static boolean isAnagram(String st1, String st2) {
		/*To read the frequency of character in 1st string*/	
		int c1[]=new int[26];
		for(int i=0; i<st1.length(); i++) {
			char ch=st1.charAt(i);
			if(ch>='A' && ch<= 'Z')
				c1[ch-65]++;
			else if(ch>='a' && ch<='z')
				c1[ch-97]++;
		}
		/*To read the frequency of character in 2nd string*/	
		int c2[]=new int[26];
		for(int i=0; i<st2.length(); i++) {
			char ch=st2.charAt(i);
			if(ch>='A' && ch<= 'Z')
				c2[ch-65]++;
			else if(ch>='a' && ch<='z')
				c2[ch-97]++;
		}
		/*Verify if the the frequency of each character is same in both string.*/
		for(int i=0; i<26; i++) {
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
	}
}
