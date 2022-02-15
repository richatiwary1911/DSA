import java.util.*;

public class GCDandLCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int product = num1 * num2;
		
		System.out.println("GCD: " + gcd(num1, num2));
		System.out.println("LCM: " + product/gcd(num1, num2));
		
	}
	
	public static int gcd(int num1, int num2)
	{
		while(num2 > 0)
		{
			int rem = num1 % num2;
			num1 = num2;
			num2 = rem;
		}
		return num1;
	}

}
