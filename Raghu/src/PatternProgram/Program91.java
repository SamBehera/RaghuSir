package PatternProgram;
/* 91 wap to print the patter 
5 5 5 5 5
4 4 4 4 4
3 3 3 3 3
2 2 2 2 2
1 1 1 1 1
*/
import java.util.Scanner;
public class Program91 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int n=sc.nextInt();
		for(int i=n; i>0; i--) {
			for(int j=n; j>0; j--) {
			System.out.print(i+ " ");
			}
			System.out.println();
		}
	}
}
