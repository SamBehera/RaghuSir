package Programs;
import java.util.Scanner;
class Leap 
{
	static boolean CheckLeapYear(int y)
	{
		if(y%4==0 && y%100!=0 || y%400==0)
			return true;
		else
			return false;
	}
	
public static void main(String Arg[])
	{
	Scanner ob= new Scanner(System.in);
	System.out.print("Enter the year:");
	int year = ob.nextInt();
	boolean chk = CheckLeapYear(year);
	if(chk == true)
	{
		System.out.print(year +" is a Leap year");
	}
	else
	{
		System.out.print(year +" is not a Leap year.");
	}
	}
}
