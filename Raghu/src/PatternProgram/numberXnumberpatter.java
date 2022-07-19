package PatternProgram;
/*71.	WAP to show where when you can take n as 5:
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
*/
import java.util.Scanner;
public class numberXnumberpatter {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}

	
