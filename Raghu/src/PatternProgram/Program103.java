package PatternProgram;
/*103.	WAP to print the pattern.
11111
 0000
  111
   00
    1
*/
import java.util.Scanner;
public class Program103 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++) {
				System.out.print(i%2+"");
			}
			System.out.println();
		}
	}
}
