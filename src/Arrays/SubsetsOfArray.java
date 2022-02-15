import java.util.*;

public class SubsetsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		subsetOfArray(a, n);

	}
	
	public static void subsetOfArray(int a[], int n)
	{
		int numberOfSubsets = (int)Math.pow(2, n) - 1;
		
		for(int i = 0; i <= numberOfSubsets; i++)
		{
			int temp = i;
			String ans = "";
			
			for(int j = n - 1; j >= 0; j--)
			{
				int rem = temp % 2;
				
				if(rem == 0)
					ans = "-\t" + ans;
				else	
					ans = a[j] + "\t" + ans;
				
				temp = temp / 2;
				
			}
		    System.out.println(ans);
		}
	}

}
