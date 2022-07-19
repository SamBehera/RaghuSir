package Programs;
/*54.	Define a method to return true if the number is Strong number 
 * otherwise return false*/

import java.util.Scanner;
public class Program54 {

static int fact(int a)
{
	int fact=1;
	while(a>1) {
		fact=fact+a;
		a--;
	}
	return fact;
}

static boolean isStrong(int x) {
	int sum=0, temp=x;
	do {
		int r=x%10;
		sum=sum+fact(r);
		x=x/10;
	}while(x!=0);
	return temp==sum;
}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n=sc.nextInt();
	boolean rs=isStrong(n);
	if(rs==true)
		System.out.println(n +" is a Strong number.");
	else
		System.out.println(n +" is not a Strong number.");
	}
}
