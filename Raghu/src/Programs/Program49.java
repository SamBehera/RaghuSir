package Programs;
/*49.	Define a method to return how many even digits present in the number. */

import java.util.Scanner;
public class Program49 {
static int countEvent(int x) {
	int count=0;
	do {
		int i=x%10;
		if (i%2==0)
		count++;
		x=x/10;
	}while(x!=0);
		return count;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int x=sc.nextInt();
	int count=countEvent(x);
	System.out.println("The number of even digits present in the number "+ x +" is "+ count);
	}
}
