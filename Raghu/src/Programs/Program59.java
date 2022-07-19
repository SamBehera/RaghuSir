package Programs;
/*59.	Define a method to return the decimal value of an octal number.*/
import java.util.Scanner;
public class Program59 {
static int octToDec(int oct) {
	int dec=0, p=1;
	do {
		int r=oct%10;
		dec=dec+r*p;
		p=p*8;
		oct=oct/10;
	}while(oct!=0);
	return dec;
}

public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an octal number:");
		int x=sc.nextInt();
		int bNum=octToDec(x);
		System.out.println("The decimal value of "+x+" is "+bNum);		
	}
}
