import java.util.*;

public class InverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int pos = 1;
		int sum = 0;
		while(n > 0)
		{
			int lastDigit = n % 10;
			sum += pos * Math.pow(10, lastDigit - 1);
			pos++;
			n /= 10;
			
		}
		System.out.println(sum);
	}

}
