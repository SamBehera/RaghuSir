/*42.  Wap to read the day number and print the corresponding day name. */
package Programs;
import java.util.Scanner;
public class GetDayName 
{
	static String getDay(int Dno)
	{
		switch(Dno)
		{
		case 1:
			return "Sunday";
		case 2:
			return "Monday";
		case 3:
			return "Tuesday";
		case 4:
			return "Wednessday";
		case 5:
			return "Thurseday";
		case 6:
			return "Friday";
		case 7:
			return "Saturday";
		default:
			return "Invaid";
		}
	}
	
public static void main(String[] args) 
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the day number:");
	int Dno = sc.nextInt();
	String day = getDay(Dno);
	System.out.println("Selected day is:" + day);
	}
}
