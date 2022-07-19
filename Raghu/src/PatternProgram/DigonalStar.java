package PatternProgram;
/*74.	WAP to show the format
*
* *
* * *
* * * *
* * * * *
*/
import java.util.Scanner;
public class DigonalStar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n=sc.nextInt();
				for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
