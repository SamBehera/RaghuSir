package Programs;
/*50.	 Define  a method to return how many prime digits present in the number. */

import java.util.Scanner;
public class Program50 {
static int countPrimeDigit(int x) {
	int pc=0;
	do{
		int n=x%10;
			if(n==1||n==2||n==3||n==5||n==7)
				pc++;
		x=x/10;
	}while(x!=0);
	return pc;
}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int x=sc.nextInt();
	int count=countPrimeDigit(x);
	System.out.println("Total prime digit in "+ x +" is "+ count);
	}
}
