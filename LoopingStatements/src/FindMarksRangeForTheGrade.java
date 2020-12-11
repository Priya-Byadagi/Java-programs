
public class FindMarksRangeForTheGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade = 'E';

		switch (grade) {
		case 'A':
			System.out.println("Your percentage is between 85-100");
			break;
		case 'B':
			System.out.println("Your percentage is between 75-84");
			break;
		case 'C':
			System.out.println("Your percentage is between 35-64");
			break;
		case 'D':
			System.out.println("Your percentage is below 35");
			break;
		default:
			System.out.println("This Grade is invalid");
		}

	}

}
