package Programs;
import java.util.Scanner;
public class Big {
	public static void main (String Arg[])
	{
	Scanner ob = new Scanner (System.in);
	System.out.print("Enter any 3 integers");
	int A = ob.nextInt();
	int B = ob.nextInt();
	int C = ob.nextInt();
	int Biggest = Biggestnum(A, B, C);
	System.out.println(Biggest + " is the biggest number." );
	
	}
	static int Biggestnum(int num1, int num2, int num3)
	{
	if(num1 > num2 && num1 > num3)
		return num1;
	
	else if (num2 > num3)
		return num2;
	
	else 
		return num3;
	}
}

