package PatternProgram;
/*78.	WAP to fine print the format:
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1
*/
import java.util.Scanner;
public class RevnumPattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n=sc.nextInt();
		for(int i=n; i>0; i--) {
			for(int j=n; j>0; j--) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}