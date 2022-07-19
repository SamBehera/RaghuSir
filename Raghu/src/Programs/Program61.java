package Programs;
/*61.	 Print how many Armstrong number within 1000*/

public class Program61 {
public static void main(String[] args) {
		int count = 0;
		for (int i=1; i<=1000; i++) 
		{
			boolean rs=isArmstrong(i);
			if(rs==true) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Number of Armstrong witin 1000 is: "+ count);
	}

static boolean isArmstrong(int x) {
		int sum=0, temp=x;
		int dc=countDigits(x);
		do {
			int r=x%10;
			sum=sum+pow(r,dc);
			x=x/10;
		}while(x!=0);
		return temp==sum;
	}
	
static int countDigits(int n) {
		int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	
	}
static int pow(int n, int p) {
		int pw=1;
		while(p>0) {
			pw=pw*n;
			p--;
		}
		return pw;
	}
}
