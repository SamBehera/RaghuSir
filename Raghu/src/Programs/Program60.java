package Programs;
/*60.	 Print all the prime number within 100*/

public class Program60 {
static boolean isPrime(int x)
{
	for(int j=2; j<=x/2; j++) {
		if(x%j==0)
			return false;
		}
	return true;
}
	public static void main(String[] args) {
		for(int i=1; i<=100; i++)
		{
			boolean rs=isPrime(i);
			if(rs==true)
			System.out.println(i);
		}
	}
}
