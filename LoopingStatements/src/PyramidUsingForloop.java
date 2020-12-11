
public class PyramidUsingForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First example:");
		for (int i = 5; i >= 1; --i) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
		System.out.println("Second example:");

		for (int m = 1; m <= 5; m++) {
			for (int n = 1; n <= m; n++) {
				System.out.print("* ");

			}
			System.out.println();
		}
		System.out.println("Third example:");
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");

			}
			System.out.println();
		}
		System.out.println("Fourth Example:");
		for (int i = 0; i <= 5; i++) {
			int n = 5;
			for (int j = 1; j <= i; j++) {
				System.out.print(n
						);
				n--;
			}
			System.out.println(" ");
		}

	}

}
