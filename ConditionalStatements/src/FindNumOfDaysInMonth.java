
public class FindNumOfDaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to illustare switch staement");
		String month = "Feb";
		switch (month) {
		case "Jan":
			System.out.println("Jan has 31 days");
			break;
		case "Feb":
			System.out.println("Feb has 28 days");
			break;
		case "Mar":
			System.out.println("Mar has 31 days");
			break;
		case "Apr":
			System.out.println("Apr has 30 days");
			break;
		case "May":
			System.out.println("May has 31 days");
			break;
		case "Jun":
			System.out.println("Jun has 30 days");
			break;
		case "Jul":
			System.out.println("Jul has 31 days");
			break;
		case "Aug":
			System.out.println("Jan has 31 days");
			break;
		case "Sept":
			System.out.println("Sept has 30 days");
			break;
		case "Oct":
			System.out.println("Oct has 31 days");
			break;
		case "Nov":
			System.out.println("Nov has 30 days");
			break;
		case "Dec":
			System.out.println("Dec has 31 days");
			break;
		default:
			System.out.println("You have entered wrong month,please enter 3 letter month:");
		}
		System.out.println("End of the program");

	}

}
