package matrix;
/*12.	WAP define a method to reverse the diagonal element.*/

class DigonalReverse {
	static void reverse_Diagonal(int[][] mat) {
		int i=0, j=mat.length-1;
		while(i<j) {
			int temp=mat[i][i];
			mat[i][i]=mat[j][j];
			mat[j][j]=temp;
			System.out.println(mat[i][i] +" " + mat[j][j]);
			
			temp=mat[i][j];
			mat[i][j]=mat[j][i];
			mat[j][i]=temp;
			System.out.println(mat[i][j] +" " + mat[j][i]);
			i++;
			j--;
		}
	}	 
public static void main(String[] args) {
		Matrix ob=new Matrix();
		int mat[][]=ob.readMat();
		ob.displayMat(mat);
		DigonalReverse.reverse_Diagonal(mat);
			}
}
