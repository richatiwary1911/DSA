import java.util.*;

public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int div = 2;
		while(n > 0)
		{
			if(n % div == 0)
			{
				System.out.print(div + " ");
				n /= div;	
				continue;
			}
			else if(div * div >= n)
				break;
			
			else
				div++;
		}
		if(n != 0)
			System.out.println(n);
	}

}
