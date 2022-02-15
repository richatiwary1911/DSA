import java.util.*;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		int m = sc.nextInt();
		int b[] = new int[m];
		
		for(int i = 0; i < m; i++)
			b[i] = sc.nextInt();
		
		sumOfArrays(a, n, b, m);
	}
	
	public static void sumOfArrays(int a[], int n, int b[], int m)
	{
		int p1 = n - 1;
		int p2 = m - 1;
		int p3;
		
		int ans[] = new int[n > m ? n : m];
		p3 = ans.length - 1;
		 
		int sum = 0;
		int carry = 0;
		
		while(p3 >= 0)
		{
			sum = (p1 >= 0 ? a[p1] : 0) + (p2 >= 0 ? b[p2] : 0) + carry;
			ans[p3] = sum % 10;
			carry = sum / 10;
			
			p1--;
			p2--;
			p3--;
		}
		
		if(carry > 0)
			System.out.print(carry);
		
		for(int s : ans)
			System.out.print(s);
	}

}
