/*42.	 WAP to find the number is even or odd using switch case. */
package Programs;

import java.util.Scanner;
public class Evenswitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		
		switch(n%2)
		{
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
		}		
	}
}
