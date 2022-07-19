package Programs;
/*51.	Define a method to return difference of sum or even digits and odd digits*/

	import java.util.Scanner;
	public class Program51 {
	
	static int getDifference(int x)
	{
		int rs=0,sOdd=0, sEven=0;
		do {
			int i=x%10;
			x=x/10;
			if(i%2==0)
				sEven=sEven+i;
			else
				sOdd=sOdd+i;
			}while(x!=0);
		rs=sEven-sOdd;
		return rs;
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number: ");
			int x=sc.nextInt();
			int dif=getDifference(x);
			System.out.println("Difference of sum or even digits and odd digits is "+dif);
		}
	}
