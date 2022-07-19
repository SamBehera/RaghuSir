package StringProgram;
/*20.	WAP to verify if the word is present in the string.*/
import java.util.Scanner;
public class VerifyWordPresence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String st=sc.nextLine();
		System.out.println("Enter the word: ");
		String w=sc.nextLine();
		String str[]=st.split(" ");
		
		for(int i=0; i<str.length;i++) 
		{
			if(str[i].equals(w)) {
			System.out.println(w +" is present.");	
			return;
			}
		}	
System.out.println(w + " is not present"); 
	}
}
