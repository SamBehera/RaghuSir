/*43.	 WAP to read the month number from the user and 
 * print the corresponding how many days in that month by using switch case. */
package Programs;
import java.util.Scanner;
public class getNoOfDays 
{
public static void main(String[] args) 
{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Month number:");
	int m = sc.nextInt();
	
	if(m==1 || m==9 || m==7 || m== 8|| m== 10 || m== 12)
		System.out.println("31 days.");
	else if(m==4 || m==5 || m==6 || m==9 || m==11)
		System.out.println("30 days.");
	else if(m==2)
		System.out.println("28 or 29 days.");
	else
		System.out.println("Invalid entry");
	}
}

