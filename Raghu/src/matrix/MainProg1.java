package matrix;

public class MainProg1 {
public static void main(String[] args) {

	Matrix mt=new Matrix();
	int x[][]=mt.readMat();

System.out.println("User enterred matrix: ");
	mt.displayMat(x);
	
	int bg=mt.getBiggest(x);
	System.out.println("BIggest is: "+ bg);
	
	int sum=mt.sumOfmat(x);
	System.out.println("sum of matrix elements= "+ sum);
	}
}
