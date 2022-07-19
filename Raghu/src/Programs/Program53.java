package Programs;
/*53.	Define a method to return true if the number is Palindrome
 *  otherwise return false. */
import java.util.Scanner;
public class Program53 {
	static boolean isPalindrome(int x) {
		int rev=0, temp=x;
		do { 
			int r=x%10;
			rev=rev*10+r;
			x=x/10;
		}while(x!=0);
		if(temp==rev)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		boolean rs=isPalindrome(n);
		if(rs==true)
			System.out.println(n +" is a palindrome number.");
		else
			System.out.println(n +" is not a palindrome number.");
	}
}
