
public class PositiveOrNegative {

	public static void main(String[] args) {

		System.out.println("Progrm to illustate Positive or negative value example");
		int num1 = 0;
		findPosOrNeg(num1);

	}

	static void findPosOrNeg(int num) {
		if (num < 0)
			System.out.println("Negative value");
		else if (num > 0)
			System.out.println("Positive value");
		else
			System.out.println("number is zero");
	}

}
