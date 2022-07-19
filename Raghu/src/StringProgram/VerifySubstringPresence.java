package StringProgram;
/*21.	WAP to verify if the substring is present in the string.*/

import java.util.Scanner;
public class VerifySubstringPresence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String st=sc.nextLine();
		System.out.println("Enter the word: ");
		String sb=sc.nextLine();
		
		if(st.indexOf(sb)>=0)
			System.out.println("Yes, it's present");
		else
			System.out.println("No, it's not present");
	}
}
