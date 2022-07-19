package PatternProgram;
/*70.	 WAp nxn star(*) pattern.
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
*/

import java.util.Scanner;
public class nBynPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
