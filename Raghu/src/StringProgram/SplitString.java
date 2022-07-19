package StringProgram;
/*19.	WAP to reverse the complete sentence.*/
import java.util.Scanner;
public class SplitString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String st=sc.nextLine();
		String str[]=st.split(" ");
		// To print	the words
		/*		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);		
		}	*/
		String rs="";
		for(int i=str.length-1; i>=0; i--) {
			rs=rs+str[i];
			if(i>0)
				rs=rs+" ";
		}
		System.out.println(rs);
	}
}
