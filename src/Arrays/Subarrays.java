import java.util.*;

public class Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		printSubarrays(a, n);
	}
	
	public static void printSubarrays(int a[], int n)
	{
		for(int start = 0; start < n; start++)
		{
			for(int end = start; end < n; end++)
			{
				for(int row = start; row <= end; row++)
				{
					System.out.print(a[row] + " ");
				}
			System.out.println();
			}
		}		
		
	}

}
