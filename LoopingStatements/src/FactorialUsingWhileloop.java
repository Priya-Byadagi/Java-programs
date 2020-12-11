
public class FactorialUsingWhileloop {

	public static void main(String[] args) {
		int i = 1, fact = 1, num = 5;
		do {
			fact *= i;
			i++;
		} while (i <= num);
		System.out.println("Factorial of a give number is: "+fact);
	}

}
