package Programs;
/*63.	Print all the 3 digit palindrome numbers*/

import java.util.Scanner;
public class Program63 {

static void checkPalindrome(int x) {
	int rev=0, temp=x;
	do { 
		int r=x%10;
		rev=rev*10+r;
		x=x/10;
	}while(x!=0);
	if(temp==rev)
		System.out.println(temp);
	
}
	public static void main(String[] args) {
		int count =0;
		for(int i=100; i<1000; i++)
			{
			checkPalindrome(i);
			count++;
			}
		System.out.println("Total palindrome number is "+ count);
	}
}
