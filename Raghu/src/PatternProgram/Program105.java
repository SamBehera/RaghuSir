package PatternProgram;
/* 105. WAP to print the pattern 
    A
   BA
  CBA
 DCBA
EDCBA
*/
import java.util.Scanner;
public class Program105 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n=sc.nextInt();
		
		for(int i=0; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j>0; j--) {
				System.out.print((char)(64+j));
			}
			System.out.println();
		}
	}
}
