package PatternProgram;
/*
109.	WAP to print the pattern.
         1
        010
       10101
      0101010
     101010101

*/
import java.util.Scanner;
public class Program109 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n=sc.nextInt();
		
		for(int i=1; i<=n-i; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			int x=i;
			for(int j=1; j<=2*i-1; j++) {
				System.out.print(x%2+ "");
				if(j<i)
					x--;
				else
					x++;
			}
			System.out.println();
		}
	}
}
