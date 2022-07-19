package PatternProgram;
/*72.	WAP to show the format
A B C D E
A B C D E
A B C D E
A B C D E
A B C D E
*/
import java.util.Scanner;
public class ABCnBYnFormat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++)
			{
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}
}
