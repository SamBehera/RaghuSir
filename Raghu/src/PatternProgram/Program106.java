package PatternProgram;
/*
 106.	WAP to print the pattern.
         1
        121
       12321
      1234321
     123454321

 */

import java.util.Scanner;
public class Program106 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n=sc.nextInt();
		
		for(int i=1; i<=n-i; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			int x=1;
			for(int j=1; j<=2*i-1; j++) {
				System.out.print(x+ "");
				if(j<i)
					x++;
				else
					x--;
			}
			System.out.println();
		}
	}
}
