package PatternProgram;
/*75.	WAP to show the format
1
0 0
1 1 1
0 0 0 0
1 1 1 1 1
*/
import java.util.Scanner;
public class onezeroPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n=sc.nextInt();
				for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i%2 +"");
			}
			System.out.println();
		}
	}
}
