import java.util.Scanner;
public class MatrixMultiplication {
	public static void main(String[]args) {
		Scanner myobj = new Scanner(System.in);
		System.out.println("ENTER THE NO OF ROWS FOR MATRIX A :");
		int rowsA = myobj.nextInt();
		System.out.println("ENTER THE NO OF COLUMNS FOR MATRIX A:");
		int colsA = myobj.nextInt();
		System.out.println("ENTER THE NO OF ROWS FOR MATRIX B:");
		int rowsB = myobj.nextInt();
		System.out.println("ENTER THE NO OF COLUMNS FOR MATRIX B:");
		int colsB = myobj.nextInt();
		if (colsB!=rowsA) {
			System.out.println("MATRIX MULTIPLICATION IS NOT POSSIBLE");
			return;
		}
		int [][]A = new int[rowsA][colsA];
		int [][]B = new int[rowsB][colsB];
		int [][]C = new int[rowsA][colsB];
		System.out.println("ENTER THE ELEMENTS OF MATRIX A :");
		for (int i = 0;i<rowsA;i++) {
			for (int j = 0;j<colsA;j++) {
				A[i][j]=myobj.nextInt();
				
			}
		}
		System.out.println("ENTER THE ELEMENTS OF MATRIX B :");
		for (int i = 0;i<rowsB;i++){
			for (int j = 0; j <colsB;j++) {
				B[i][j]=myobj.nextInt();
			}
		}
		for (int i = 0 ;i<rowsA;i++) {
			for(int j = 0;j<colsB;j++) {
				for (int k = 0;k<colsA;k++) {
					C[i][j]+=A[i][k]*B[k][j];
				}
			}
		}
		System.out.println("THE PRODUCT OF MATRICES ARE:");
		for (int i = 0;i<rowsA;i++) {
			for (int j =0;j<colsB;j++) {
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}
		myobj.close();
	}

}
		