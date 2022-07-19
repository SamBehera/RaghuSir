package Programs;

/*44.	Define  a method to return how many digits present in the number. */
import java.util.Scanner;
public class MainDigitsInNumber 
{
	static int countDigits(int n)
	{
	int count=0;
	do {
		count++;
		n=n/10;
	}
		while(n!=0);
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x=sc.nextInt();
		int dc=countDigits(x);
		System.out.println(dc);
	}
}

