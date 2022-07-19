 package PatternProgram;
/* 102.	WAP to print the pattern.
 10101
  0101
   101
    01
     1
*/
import java.util.Scanner;
public class Program102 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++) {
				System.out.print(j%2+"");
			}
			System.out.println();
		}
	}
}
