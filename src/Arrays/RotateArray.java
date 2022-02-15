import java.util.*;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		int numberOfRotation = sc.nextInt();
		
		rotate(a, n, numberOfRotation);
		
		for(int j : a)
			System.out.print(j + " ");
		
	}

	
	public static void rotate(int a[], int n, int numberOfRotation)
	{
		numberOfRotation %= n;
		if(numberOfRotation < 0)
			numberOfRotation += n;
		
		//right rotate
		reverse(a, 0, n - 1);					
		reverse(a, 0, numberOfRotation - 1);
		reverse(a, numberOfRotation, n - 1);
	}
	
	public static void reverse(int a[], int start, int end)
	{
		while(start < end)
		{
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			
			start++;
			end--;
		}
	}
	
}


