package special;
/*WAP to convert a number into string format number*/

import java.util.Scanner;
public class MainNumber {
	static void num(int x, String st) {
		if(x==0)
			return;
		String one[]= {"", "one", "two", "three","four", "five", "six", "seven", "eight","nine","ten", "eleven", "twelve", 
				"thirteen", "fourteen", "fifteen", "sixteen","seventeen", "eighteen", "nineteen"};
		String two[]= {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"};
		
		if(x<20)
			System.out.print(one[x]);
		else
			System.out.print(two[x/10]+one[x%10]);
		System.out.print(st + " ");
	}
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int x=sc.nextInt();
	num(x/10000000, " Crore");
	num(x/1000000%100, " Lakh");
	num(x/1000%100, " thousand");
	num(x/100%10, " hundred");
	num(x%100, "");
	}
}