package PatternProgram;

import java.util.Scanner;
public class Program90 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n=sc.nextInt();
		for(int i=1; i<=n;i++) {
			int x=i;
			for(int j=1; j<=i; j++) {
				System.out.print(x+" ");
				x++;
			}
			System.out.println();	
		}
	}
}
