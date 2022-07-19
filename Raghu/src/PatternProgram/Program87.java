package PatternProgram;
/*
 87.	WAP to print the pattern
1 
2 3 
4 5 6 
7 8 9 1 
2 3 4 5 6 
*/
import java.util.Scanner;
public class Program87 {

	public static void main(String[] args) {
		int x=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n=sc.nextInt();
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(x+" ");
				x++;
				if(x==10)
					x=1;
			}
			System.out.println();	
		}
	}
}
