package PatternProgram;
/*82.	WAP to print the patterns:
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1
*/

import java.util.Scanner;
public class Program82 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n=sc.nextInt();
		for(int i=n; i>0;i--) {
			for(int j=n; j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();	
		}
	}
}
