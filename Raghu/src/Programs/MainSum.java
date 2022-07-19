package Programs;
import java.util.Scanner;
public class MainSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

						Scanner sc = new Scanner(System.in);
						System.out.println("Enter the value of n");
						int n =sc.nextInt();
						int sum =getSum(n);
						System.out.println("Facrotial of" + n + " is "+ sum);
						
						}

	
			static int getSum(int x)
			{
				int Sum=0;
				while (x>0)
				{
					Sum=Sum+x;
					x--;
				}
				return Sum;
			}
		}
