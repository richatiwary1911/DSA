import java.util.*;

public class WaveDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numberOfRows = sc.nextInt();
		int numberOfCols = sc.nextInt();
		
		int a[][] = new int[numberOfRows][numberOfCols];
		
		for(int i = 0; i < numberOfRows; i++)
			for(int j = 0; j < numberOfCols; j++)
				a[i][j] = sc.nextInt();
		
		waveDisplay(a, numberOfRows, numberOfCols);

	}
	
	public static void waveDisplay(int a[][], int n, int m)
	{
		int col = 0;
		while(col <= m - 1)
		{
			if(col % 2 == 0)
			{
				for(int i = 0; i < n; i++)
					System.out.print(a[i][col] + " ");
				col++;
			}
			else
			{
				for(int i = n - 1; i >= 0; i--)
					System.out.print(a[i][col] + " ");
				col++;
			}
		}
		
		
		
		
	}

}
