/*38.	 Define a method to return pass if score >=35 in all the 4 subject, 
otherwise return fail. */

package Programs;
import java.util.Scanner;

class Result {
	
	static boolean CheckResult(int P, int C, int M, int B)
	{
		if(P>=35 && C>=35 && M>=35 && B>=35)
			return true;
		else
			return false;
	}
	public static void main (String Arg[])
		{
		Scanner ob = new Scanner (System.in);
		System.out.print("Enter the marks of Phy, Chem, Mat & Bio");
		int phy = ob.nextInt();
		int chem = ob.nextInt();
		int mat  = ob.nextInt();
		int bio = ob.nextInt();
		
		boolean res = CheckResult(phy, chem, mat, bio);
		if(res == true)
			System.out.println("You passed.");
		else
			System.out.println(" You failed. Better luck next time!!");
		}
}
