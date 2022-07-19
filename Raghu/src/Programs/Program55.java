package Programs;
/*55.	 Define a method to return is it’s  Armstorng number more then 3 digit number. 
 * It's for more then 3 digit number*/
import java.util.Scanner;
public class Program55 {
static boolean isArmstrong(int x) {
	int sum=0, temp=x;
	int dc=countDigit(x);
	do {
		int r=x%10;
		sum=sum+Pow(r,dc);
		x=x/10;
	}while(x!=0);
return sum==temp;
}
static int Pow(int n, int p) {
	int pw=1;
	while(p>0) {
		pw=pw*n;
		p--;
	}
	return pw;
}
static int countDigit(int n) {
	int count=0;
	do {
		count++;
		n=n/10;
	}while(n!=0);
	return count;
}
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		boolean rs=isArmstrong(n);
		if(rs==true)
			System.out.println(n +" is a ArmStrong number.");
		else
			System.out.println(n +" is not a ArmStrong number.");
	}
}
