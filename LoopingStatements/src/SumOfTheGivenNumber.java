
public class SumOfTheGivenNumber {
	public static void main(String[] args) {

		int temp, num = 123;
		int sum = 0;
		do {
			temp = num % 10;
			sum += temp;
			num /= 10;
		} while (num > 0);
		System.out.println("The sum of digits:" + sum);

	}

}
