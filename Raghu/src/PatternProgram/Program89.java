package PatternProgram;
/*
 89.	WAP to print the pattern
1 
0 1 
0 1 0 
1 0 1 0
1 0 1 0 1
*/
import java.util.Scanner;
public class Program89 {

	public static void main(String[] args) {
		int x=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n=sc.nextInt();
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(x%2+" ");
				x++;
			}
			System.out.println();	
		}
	}
}

