import java.util.*;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numberOfRows1 = sc.nextInt();
		int numberOfCols1 = sc.nextInt();
		
		int a[][] = new int[numberOfRows1][numberOfCols1];
		
		for(int i = 0; i < numberOfRows1; i++)
			for(int j = 0; j < numberOfCols1; j++)
				a[i][j] = sc.nextInt();
		
		int numberOfRows2 = sc.nextInt();
		int numberOfCols2 = sc.nextInt();
		
		int b[][] = new int[numberOfRows2][numberOfCols2];
		
		for(int i = 0; i < numberOfRows2; i++)
			for(int j = 0; j < numberOfCols2; j++)
				b[i][j] = sc.nextInt();
		
		if(numberOfCols1 != numberOfRows2)
		{
			System.out.println("Multiplication not allowed - Invalid input");
			return;
		}
		
		else
			multiplyMatrix(a, numberOfRows1, numberOfCols1, b, numberOfRows2, numberOfCols2);
	}
	
	public static void multiplyMatrix(int a[][], int n1, int m1, int b[][], int n2, int m2)
	{
		int product[][] = new int[n1][m2];
		
		for(int i = 0; i < n1; i++)
		{
			for(int j = 0; j < m2; j++)
			{
				for(int k = 0; k < m1; k++)
				{
					product[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		display(product, n1, m2);
	}

	public static void display(int a[][], int n, int m)
	{
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
