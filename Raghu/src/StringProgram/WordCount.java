package StringProgram;
/*3.	WAP to define a method to return how many words present in the sentence. */
import java.util.Scanner;
public class WordCount {
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter a string: ");
		String st=sc.nextLine();
		int wc=countWords(st);
		System.out.println("Number of words in the sentence is: "+ wc);
	}

	static int countWords(String str) {
		int wc=0;
		char ch[]=str.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
				wc++;
		}
		return wc;
	}
}


