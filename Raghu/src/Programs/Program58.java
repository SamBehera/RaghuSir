package Programs;

import java.util.Scanner;
public class Program58 {
static int binToDec(int bin) {
	int dec=0, p=1;
	do {
		int r=bin%10;
		dec=dec+r*p;
		p=p*2;
		bin=bin/10;
	}while(bin!=0);
	return dec;
}

public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a binary number:");
		int x=sc.nextInt();
		int bNum=binToDec(x);
		System.out.println("The decimal value of "+x+" is "+bNum);		
	}
}
