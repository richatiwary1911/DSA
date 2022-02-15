import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		int key = sc.nextInt();
		
		int pos = binarySearch(a, n, key);
		
		if(pos != -1)
			System.out.println(key + " is at position " + pos);
		else
			System.out.println("Key not found");

	}
	
	public static int binarySearch(int a[], int n, int key)
	{
		int low = 0;
		int high = n - 1;
		
		while(low <= high)
		{
			int mid = low + (high - low) / 2;
			
			if(a[mid] == key)
				return mid;
			
			else if(a[mid] > key)
				high = mid - 1;
			
			else
				low = mid + 1;
		}
		
		return -1;
	}

}
