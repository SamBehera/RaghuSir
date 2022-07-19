package Programs;
/*56.	 Define a method to return is it’s  DISARIUM number.*/
import java.util.Scanner;
public class Program56 {

	static boolean isDisarium(int x) {
		int sum=0, temp=x;
		int dc=countDigit(x);
		do {
			int r=x%10;
			sum=sum+Pow(r,dc);
			dc--;
			x=x/10;
		}while(x!=0);
	return sum==temp;
	}

	static int Pow(int n, int p) {
		int pw=1;
		while(p>0) {
			pw=pw*n;
			p--;
		}
		return pw;
	}

	static int countDigit(int n) {
		int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	}
		
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number: ");
			int n=sc.nextInt();
			boolean rs=isDisarium(n);
			if(rs==true)
				System.out.println(n +" is a Disarium number.");
			else
				System.out.println(n +" is not a Disarium number.");
		}
	}