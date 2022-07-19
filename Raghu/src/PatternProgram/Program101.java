package PatternProgram;
/*101.	WAP to print the pattern.
	1
   01
  101
 0101
10101

*/
import java.util.Scanner;
public class Program101 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j>0; j--) {
				System.out.print(j%2+"");
			}
			System.out.println();
		}
	}
}
