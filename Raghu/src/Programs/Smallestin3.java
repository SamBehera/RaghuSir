/*39.	Define a method to return smallest among three numbers.*/
package Programs;
import java.util.Scanner;

public class Smallestin3 
{
	static int CheckSmallest(int num1, int num2, int num3)
	{
	if(num1 <  num2 && num1 < num3)
		return num1;
	else if (num2 < num3)
		return num2;
	else 
		return num3;
	}
public static void main(String[] args) 
	{
	Scanner ob = new Scanner (System.in);
	System.out.print("Enter any 3 integers");
	int x = ob.nextInt();
	int y = ob.nextInt();
	int z = ob.nextInt();
	int small = CheckSmallest(x, y, z);
	System.out.println(small +" is the smalles number.");
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number:");
	int X = sc.nextInt();
	boolean rs = Special2digit.IsSpecialTwoDigit(X);
	if(rs==true)
		System.out.println(x +" is a special 2 digit number.");
	else
		System.out.println(x +" is not a special 2 digit number.");
	}
}
