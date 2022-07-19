package special;

public class Date {
	int dd, mm, yy;
	int month[]= {0,30,28,31,30,31,30,31,31,30,31,30,31};
	String dname[]={"Sunday", "Monday", "Tuesday", "Wednessday", "Thurseday", "Friday","Saturday"};
	
	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		if(yy%400==0 || yy%4==0 && yy%100!=0)
			month[2]=29;
	}
public int noOfDays() {
	int days=dd;
	for (int i=1; i<mm;i++) 
		days=days+month[i];
	int y=yy-1;
	
		days=days+y*365;
		days=days/400+y/4-y/100;
	return days;
}
/*>>>>>>>>>> Overriding toString Method to get the value of the object reference <<<<<<<<<<<<<<*/
public String toString() {
		return dd+"/"+mm+"/"+yy ;
	}
/*>>>>>>>>>>>>>> To get the day of specific date <<<<<<<<<<<<<<<<<*/
public String getDayName() {
	return dname[noOfDays()%7];
	}
}