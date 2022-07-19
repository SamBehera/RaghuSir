package Programs;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n and P");
		int n =sc.nextInt();
		int p =sc.nextInt();
		int pow=1;
		while(p>0)
		{
			pow=pow*n;
			p--;
		}
		System.out.println("Result is: " + pow);
				
	}

}
