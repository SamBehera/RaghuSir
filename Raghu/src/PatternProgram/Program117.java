package PatternProgram;
/*117.	WAP to print the pattern.
   1
  1*2
 1*2*3
1*2*3*4
 1*2*3
  1*2
   1
*/
import java.util.Scanner;
public class Program117 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n=sc.nextInt();
		
		int space=n/2, star=1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=star; j++) {
				System.out.print(j+"");
				if(j<star)
					System.out.print("*");
			}
				if(i<=n/2)
				{
					space--;
					star++;
				}
				else
				{
					space++;
					star--;
				}
			System.out.println();
		}
	}	
}
