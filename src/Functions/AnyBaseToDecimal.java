import java.util.*;

public class AnyBaseToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int base = sc.nextInt();
		
		System.out.println(anyBaseToDecimal(num, base));

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

}
