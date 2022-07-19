package StringProgram;
/*18.	WAP to reverse each word of a sentence.*/
import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		String rs="";
		for(int i=0; i<ch.length; i++) {
			int j=i;
			while(i<ch.length && ch[i]!=' ') {
				i++;
			}
			int k=i-1;
			while(k>=j) {
				rs=rs+ch[k];
				k--;
			}
			if(i<ch.length)
				rs=rs+ch[i];
		}
		System.out.println(rs);
	}
}
