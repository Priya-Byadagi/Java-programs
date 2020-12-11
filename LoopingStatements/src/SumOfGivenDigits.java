
public class SumOfGivenDigits {

	public static void main(String[] args) {
		
		int num = 123, sum = 0;

		for (; num > 0;) {
			int temp = num % 10;
			sum += temp;
			num /= 10;

		}
		System.out.println("the sum of digits:" + sum);

	}

}
