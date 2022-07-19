/*41.	Define a method to return the month name for corresponding month number. */

package Programs;
import java.util.Scanner;

public class Calender 
{
	static String CheckMonth(int M)
	{
		switch (M)
		{
		case 1: 
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4: 
			return "April"; 
		case 5: 
			return "May";
		case 6:
			return "June";
		case 7:
			return "july";
		case 8: 
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11: 
			return "November";
		case 12:
			return "December";
		default :
			return "Invalid";
			}
	}

public static void main(String[] args) 
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter a number:");
		int x = ob.nextInt();
		String mon = CheckMonth(x);
		System.out.println("You have select " + mon + " month.");
	}
}
