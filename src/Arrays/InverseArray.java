import java.util.*;

public class InverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		inverseArray(a, n);
		
	}
	
	public static void inverseArray(int a[], int n)
	{
		int ans[] = new int[n];
		
		for(int i  = 0; i < n; i++)
			ans[a[i]] = i;
	
		for(int j : ans)
			System.out.print(j + " ");
	
	}
}
