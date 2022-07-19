package matrix;

import java.util.Scanner;

public class Matrix {

/*>>Method to read a matrix<<*/	
int[][] readMat(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the order of the matrix: ");
	int row=sc.nextInt();
	int col=sc.nextInt();
	int [][] mat=new int[row][col];
	
	System.out.println("Enter " +row*col+ "Elelments ro wise.");
	
	for(int i=0; i<mat.length;i++) {
		for(int j=0;j<mat[i].length; j++) {
			mat[i][j]=sc.nextInt();
			}
		}
	return mat;
}
/*>>Method to display a matrix<<*/
void displayMat(int[][] mat) {
	for(int i=0; i<mat.length;i++) {
		for(int j=0;j<mat[i].length; j++) {
			System.out.print(mat[i][j]+" ");
			}
		System.out.println("");
		}
	}

/*Method to find the biggest element in the array*/
int getBiggest(int[][] mat) {
		int big=mat[0][0];
		for(int i=0; i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j]>big)
					big=mat[i][j];
			}
		}
		return big;
	}
/*Method to return the sum of the matrix*/
int sumOfmat(int[][] mat) {
		int sum=0;
		for(int i=0; i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				sum=sum+mat[i][j];
			}
		}
		return sum;
	}
}
