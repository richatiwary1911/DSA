import java.util.*;

public class RingRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numberOfRows = sc.nextInt();
		int numberOfCols = sc.nextInt();
		
		int a[][] = new int[numberOfRows][numberOfCols];
		
		for(int i = 0; i < numberOfRows; i++)
			for(int j = 0; j < numberOfCols; j++)
				a[i][j] = sc.nextInt();
		
		int shellNumber = sc.nextInt();
		int numberOfRotations = sc.nextInt();
		ringRotate(a, numberOfRows, numberOfCols, shellNumber, numberOfRotations);
	}
	
	public static void ringRotate(int a[][], int n, int m, int s, int k)
	{
		int minRow = s - 1;
		int maxRow = n - s;
		int minCol = s - 1;
		int maxCol = m - s;
		
		int size = 2 * (maxRow - minRow) + 2 * (maxCol - minCol);
		
		int oneDimArray[] = new int[size];
		
		int idx = 0;
		
		for(int i = minRow; i <= maxRow; i++)
			oneDimArray[idx++] = a[i][minCol];
		minCol++;
		
		for(int i = minCol; i <= maxCol; i++)
			oneDimArray[idx++] = a[maxRow][i];
		maxRow--;
		
		for(int i = maxRow; i >= minRow; i--)
			oneDimArray[idx++] = a[i][maxCol];
		maxCol--;
		
		for(int i = maxCol; i >= minCol; i--)
			oneDimArray[idx++] = a[minRow][i];
		minRow++;
		
		rotateOneDimArray(oneDimArray, size, k);
		
		idx = 0;
		minRow = s - 1;
		maxRow = n - s;
		minCol = s - 1;
		maxCol = m - s;
		
		for(int i = minRow; i <= maxRow; i++)
			a[i][minCol] = oneDimArray[idx++];
		minCol++;
		
		for(int i = minCol; i <= maxCol; i++)
			a[maxRow][i] = oneDimArray[idx++];
		maxRow--;
		
		for(int i = maxRow; i >= minRow; i--)
			a[i][maxCol] = oneDimArray[idx++];
		maxCol--;
		
		for(int i = maxCol; i >= minCol; i--)
			a[minRow][i] = oneDimArray[idx++];
		minRow++;
		
		display(a, n, m);
	}
	
	public static void rotateOneDimArray(int oneDim[], int n, int k)
	{
		reverse(oneDim, 0, n - 1);
		reverse(oneDim, 0, k - 1);
		reverse(oneDim, k, n - 1);
	}
	
	public static void reverse(int oneDim[], int start, int end)
	{
		while(start < end)
		{
			int temp = oneDim[start];
			oneDim[start] = oneDim[end];
			oneDim[end] = temp;
			
			start++;
			end--;
			
		}
	}
	
	public static void display(int a[][], int row, int col)
	{
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < col; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
			
			
	}

}
