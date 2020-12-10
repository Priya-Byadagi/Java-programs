
public class SwitchStatementsForCollegeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to illustare the switch within switch statements:");
		String college = "GECW";
		String branch = "ise";

		switch (college) {
		case "GECW":
			System.out.println("Welcome to GECW college");

			switch (branch) {
			case "cse":
				System.out.println("In the cse branch u have a subjects like Oops,java and cprogramming langauge");
				break;
			case "ece":
				System.out.println(
						"In the ece branch u have a subjects like embede system,machine learning and power operation");
				break;
			case "civ":
				System.out.println("In the civ branch u have a subjects like survey,chemistry and pavement design");
				break;
			default:
				System.out.println("This brach is not avilable in GECW college");

			}
			break;
		case "appa":
			System.out.println("Welcome to appa college");

			switch (branch) {
			case "ise":
				System.out.println("In the cse branch u have a subjects like Oops,java and cprogramming langauge");
				break;
			case "ece":
				System.out.println(
						"In the ece branch u have a subjects like embede system,machine learning and power operation");
				break;
			case "civ":
				System.out.println("In the civ branch u have a subjects like survey,chemistry and pavement design");
				break;
			default:
				System.out.println("This brach is not avilable in appa college");

			}
			break;
		default:
			System.out.println("The college is not available");

		}

	}

}
