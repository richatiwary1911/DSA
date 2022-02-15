import java.util.Scanner;

public class RotateGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		rotate(n, k);
	}
	
	public static void rotate(int n, int k)
	{
		int numberOfDigits = (int)Math.log10(n) + 1;
		 
		k %= numberOfDigits;
		 if(k < 0)
			 k += numberOfDigits;
		
		for(int i = 0; i < k; i++)
		{
			int lastDigit = n % 10;
			n /= 10;
			n += lastDigit * Math.pow(10,  numberOfDigits - 1);
			
		}
		System.out.println(n);
	}

}
