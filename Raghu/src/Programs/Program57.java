package Programs;
/*57.	 Define methods to return Binary value, octal value
 *  and hexadecimal value of a decimal number.*/
import java.util.Scanner;
public class Program57 {

static String decToBin(int dec) {
	String bin="";
	do {
		int r=dec%2;
		bin=r+bin;
		dec=dec/2;
	}while(dec!=0);
	return bin;
}
static String decToOct(int dec) {
	String oct="";
	do {
		int r=dec%8;
		oct=r+oct;
		dec=dec/2;
	}while(dec!=0);
	return oct;
}

static String decToHexa(int dec) {
	String hex="	";
	do {
		int r=dec%16;
		if(r<10)
			hex=r+hex;
		else 
			hex=(char)(r+55)+hex; //whole switch case can also be replaced using ascii value
	/*		switch(r) {
		case 10: hex="A"+hex; 
					break;
		case 11: hex="B"+hex; 
					break;
		case 12: hex="C"+hex; 
					break;
		case 13: hex="D"+hex; 
					break;
		case 14: hex="E"+hex; 
					break;
		case 15: hex="F"+hex; 
					break;
		}
	*/
		dec=dec/16;
	}while(dec!=0);
	return hex;
}

public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=sc.nextInt();
		String b=decToBin(x);
		String o=decToOct(x);
		String h=decToHexa(x);
		System.out.println("Binary value of "+ x +" is "+b);
		System.out.println("Octal value of "+ x +" is "+o);
		System.out.println("Hexadecimal value of "+ x +" is "+h);
	}
}
