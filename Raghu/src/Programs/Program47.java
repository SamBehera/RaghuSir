package Programs;
/*47.	 Define a method to return product of digits.*/

import java.util.Scanner;
public class Program47 {
	
	static int product(int x) {
		int res=1;
		do {
			int i=x%10;
			res=res*i;
			x=x/10;
		}while(x!=0);
		return res;
	}	
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int p=product(n);
		System.out.println(p + "is the prodct of the digits of the number" + n);
	}
}
