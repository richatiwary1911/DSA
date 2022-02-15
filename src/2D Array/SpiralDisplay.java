import java.util.*;

public class SpiralDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numberOfRows = sc.nextInt();
		int numberOfCols = sc.nextInt();
		
		int a[][] = new int[numberOfRows][numberOfCols];
		
		for(int i = 0; i < numberOfRows; i++)
			for(int j = 0; j < numberOfCols; j++)
				a[i][j] = sc.nextInt();
		
		spiralDisplay(a, numberOfRows, numberOfCols);

	}

	public static void spiralDisplay(int a[][], int n, int m)
	{
		int minRow = 0;
		int maxRow = n - 1;
		int minCol = 0;
		int maxCol = m - 1;
		
		int totalElements = n * m;
		int count = 0;
		
		while(count < totalElements)
		{
			if(count < totalElements)
			{
				for(int i = minRow; i <= maxRow; i++)
				{
					System.out.print(a[i][minCol] + " ");
					count++;
				}
				minCol++;
			}
			
			if(count < totalElements)
			{
				for(int i = minCol; i <= maxCol; i++)
				{
					System.out.print(a[maxRow][i] + " ");
					count++;
				}
				maxRow--;
			}
			
			if(count < totalElements)
			{
				for(int i = maxRow; i >= minRow; i--)
				{
					System.out.print(a[i][maxCol] + " ");
					count++;
				}
				maxCol--;
			}
			
			if(count <= totalElements)
			{
				for(int i = maxCol; i >= minCol; i--)
				{
					System.out.print(a[minRow][i] + " ");
					count++;
				}
				minRow++;
			}
		}
	}
	
}
