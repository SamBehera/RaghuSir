package PatternProgram;
/* program 80
 5
 4 5
 3 4 5
 2 3 4 5
 1 2 3 4 5
 */

import java.util.Scanner;
public class Program80 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n=sc.nextInt();
		for(int i=n; i>0; i--) {
			for(int j=i; j<=n; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}