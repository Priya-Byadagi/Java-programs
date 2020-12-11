
public class EvenOrOdd {

	public static void main(String[] args) {

		int num1 = 10;
		findEvenOdd(num1);
		int num2 = 90;
		findEvenOdd(num2);
		int num3 = 133;
		findEvenOdd(num3);
	}

	static void findEvenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}

	}
}
