package StringProgram;
/*2.WAP to define a method to convert all the character in the string to lower case. */
import java.util.Scanner;
public class upperTOlower {
	static String ConvertlowerCase(String str){
		char ch[]=str.toCharArray(); //To convert from string to CharacterArray
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>='A'&&ch[i]<='Z')
				ch[i]=(char)(ch[i]+32)	;
		}		
		str=new  String(ch); //To convert from characterArray to string
		return str;
	}

public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter a string: ");
		String st=sc.nextLine();
		System.out.println("Before converting to lower case: "+ st);
		st=ConvertlowerCase(st);
		System.out.println("After converting to lower case: "+ st);
	}
}
