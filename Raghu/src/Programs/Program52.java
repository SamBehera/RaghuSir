package Programs;
/*52.	 Define a method to return the reverse of the number. */
import java.util.Scanner;
public class Program52 {
	static int reverse(int x) {
		int rev=0;
		do { 
			int r=x%10;
			rev=rev*10+r;
			x=x/10;
		}while(x!=0);
		return rev;
	}

public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int rv=reverse(n);
		System.out.println("reverse of the number "+ n +" is " + rv);
	}
}
