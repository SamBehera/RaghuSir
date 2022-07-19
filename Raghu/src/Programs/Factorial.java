package Programs;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the value of n");
				int n =sc.nextInt();
				int f =getFactorial(n);
				System.out.println("Facrotial of" + n + " is "+ f);
				
				}

	static int getFactorial(int x)
	{
		int fact=1;
		while (x>1)
		{
			fact=fact*x;
			x--;
		}
		return fact;
	}

}
