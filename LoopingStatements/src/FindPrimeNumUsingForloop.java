
public class FindPrimeNumUsingForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;

		boolean f = false;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				f = true;
				break;
			}
		}
		if (!f) {
			System.out.println(num + " is a prime number");

		} else {
			System.out.println(num + " is not prime number");
		}

	}

}
