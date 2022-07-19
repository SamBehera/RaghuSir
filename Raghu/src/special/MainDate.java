package special;

import java.util.Scanner;

public class MainDate {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first date: (dd mm yyyy)");
	int dt1=sc.nextInt();
	int mt1=sc.nextInt();
	int yt1=sc.nextInt();
	Date d1=new Date(dt1, mt1, yt1);
	
	System.out.println("Enter the second date: (dd mm yyyy)");
	int dt2=sc.nextInt();
	int mt2=sc.nextInt();
	int yt2=sc.nextInt();
	Date d2=new Date(dt2, mt2, yt2);
	System.out.println("No of days between "+d1+" and "+d2+" is: ");
	System.out.println(d2.noOfDays()-d1.noOfDays());
	
	System.out.println("Day name of "+d1+" date is: "+d1.getDayName());
	System.out.println("Day name of "+d2+" date is: "+d2.getDayName());
	}

}