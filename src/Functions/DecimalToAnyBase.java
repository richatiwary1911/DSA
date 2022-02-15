import java.util.*;

public class DecimalToAnyBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int base = sc.nextInt();
		
		System.out.println(decimalToAnyBase(num, base));
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
