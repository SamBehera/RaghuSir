package Programs;
/*62.	Print all the diserium number within n*/

import java.util.Scanner;
public class Program62 {
public static void main(String[] args) {
		int count = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range: ");
		int n=sc.nextInt();
		for (int i=1; i<=n; i++) 
		{
			boolean rs=isDiserium(i);
			if(rs==true) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Number of diserium within "+ n +" is "+ count);
	}

static boolean isDiserium(int x) {
		int sum=0, temp=x;
		int dc=countDigits(x);
		do {
			int r=x%10;
			sum=sum+pow(r,dc);
			dc--;
			x=x/10;
		}while(x!=0);
		return temp==sum;
	}
	
static int countDigits(int n) {
		int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	
	}
static int pow(int n, int p) {
		int pw=1;
		while(p>0) {
			pw=pw*n;
			p--;
		}
		return pw;
	}
}