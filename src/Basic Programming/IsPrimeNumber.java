import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(prime(n) == true)
			System.out.println(n + " is a prime number");
		else
			System.out.println(n + " is not a prime number");
	}
	
	public static boolean prime(int n)
	{
		for(int i = 2; i <= Math.sqrt(n); i++)
		{
			if(n % i == 0)
				return false;
		}
		return true;
	}

}
