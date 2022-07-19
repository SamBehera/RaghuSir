package matrix;
/*10.	WAP define a method to display the matrix element in spiral order.*/
public class SpiralMatrix {
	public static void main(String[] args) {
		Matrix ob=new Matrix();
		int mat[][]=ob.readMat();
		ob.displayMat(mat);
		int n=mat.length;

		for(int i=0, j=n-1;i<j; i++, j--)
		{
			for(int k=i; k<j; k++) {
				System.out.print(mat[i][k]+ " ");
			}
			for(int k=i; k<j;k++) {
				System.out.print(mat[k][j]+ " ");
			}
			for(int k=j; k>i; k--) {
				System.out.print(mat[j][k]);
			}
			for(int k=j; k>i;k--) {
				System.out.print(mat[k][i]);
			}
		}
		if(n%2==1)
			System.out.println(mat[n/2][n/2]);
	}
}
