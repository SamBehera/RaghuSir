package Programs;
/*48.	 Define a method to return the avg of digits in the number. */
import java.util.Scanner;
public class Program48 {

static int average(int n)
{
	int sum=0, count=0;
	do {
		int i=n%10;
		sum=sum+i;
		n=n/10;
		count++;
	}while(n!=0);
	int avrg=sum/count;
	return avrg;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int x=sc.nextInt();
	int avg=average(x);
	System.out.println(avg +" is the average of the digits in the number"+ x);
	}
}
