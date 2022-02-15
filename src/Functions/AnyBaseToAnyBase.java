import java.util.*;

public class AnyBaseToAnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int srcBase = sc.nextInt();
		int destBase = sc.nextInt();
		
		int intermediateAns = anyBaseToDecimal(num, srcBase);
		int ans = decimalToAnyBase(intermediateAns, destBase);
		
		System.out.println(ans);
	}
	
	public static int anyBaseToDecimal(int n, int b)
	{
		int sum = 0;
		int count = 0;
		while(n > 0)
		{
			int lastDigit = n % 10;
			sum += (int) (lastDigit * Math.pow(b, count++));
			n /= 10;
		}
		
		return sum;
	}
	
	public static int decimalToAnyBase(int n, int b)
	{
		int count = 0;
		int sum = 0;
		while( n > 0)
		{
			int rem = n % b;
			n /= b;
			sum += rem * Math.pow(10, count++);			
		}
		return sum;
	}

}
