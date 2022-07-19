/*40.	Define a method to return true if the number is even otherwise return false. */
package Programs;
import java.util.Scanner;

public class Even 
{
	static boolean CheckEven(int a)
	{
		if(a%2==0)
			return true;
		else
			return false;
	}
public static void main(String[] args) 
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = ob.nextInt();
		boolean res = CheckEven(num);
		if(res == true)
			System.out.println(num +" is an even number.");
		else
			System.out.println(num +" is an odd number.");
	}
}
