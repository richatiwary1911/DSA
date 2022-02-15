import java.util.Scanner;

public class ReverseGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n > 0)
		{
			int lastDigit = n % 10;
			System.out.print(lastDigit);
			n /= 10;
		}

	}

}
