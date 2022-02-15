import java.util.*;

public class RotateBy90Degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//sqare matrix
		int numberOfRows = sc.nextInt();
		int numberOfCols = sc.nextInt();
		
		int a[][] = new int[numberOfRows][numberOfCols];
		
		for(int i = 0; i < numberOfRows; i++)
			for(int j = 0; j < numberOfCols; j++)
				a[i][j] = sc.nextInt();
		
		rotateBy90Degree(a, numberOfRows, numberOfCols);
	}
	
	public static void rotateBy90Degree(int a[][], int n, int m)
	{
		transposeMatrix(a, n, m);
		reverseRows(a, n, m);
		display(a, n ,m);
	}
	
	public static void transposeMatrix(int a[][], int n, int m)
	{
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < i; j++)
			{
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
	}
	
	public static void reverseRows(int a[][], int n, int m)
	{
		for(int i = 0; i < n; i++)
		{
			int li = 0;
			int ri = m - 1;
			
			while(li < ri)
			{
				int temp = a[i][li];
				a[i][li] = a[i][ri];
				a[i][ri] = temp;
				
				li++;
				ri--;
			}
		}
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
