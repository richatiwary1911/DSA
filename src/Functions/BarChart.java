import java.util.*;

public class BarChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		int max = 0;
		
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
			max = Math.max(a[i], max);
		}
		
		for(int i = max; i >= 0; i--)
		{
			for(int j = 0; j < n; j++)
			{
				if(a[j] > i)
					System.out.print("*\t");
				else
					System.out.print("\t");
			}
			System.out.println();
		}
		
	}
	
}
