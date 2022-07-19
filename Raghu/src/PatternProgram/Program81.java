package PatternProgram;
/*Format to print:
 
A
BA
CBA
DCBA
EDCBA
  
 */

import java.util.Scanner;
public class Program81 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n=sc.nextInt();
		for(int i=1; i<=n;i++) {
			for(int j=i;j>0; j--) {
				System.out.print((char)(64+j)+"");
			}
			System.out.println();
		}
	}
}
