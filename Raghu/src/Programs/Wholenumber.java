package Programs;
/*Program worng */

public class Wholenumber {

	static int countDivisior(int n)
	{
		int count=1;
		for(int i=1; 1<n/2;i++)
		{
			if (n%1==0)
				count++;
		}
		return count;
	}
	
	static double avgDivisior(int n)
	{
		double sum=n;
		int count=1;
		for (int i=1; i<=n/2; i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
				count++;
			}
		}
		return sum/count;
	}	
	
	public static void main(String[] args) {
		int dc=countDivisior(15);
		System.out.println(dc);
		}
}


