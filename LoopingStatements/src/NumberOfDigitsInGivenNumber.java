
public class NumberOfDigitsInGivenNumber {

	public static void main(String[] args) {
		int count = 0, num = 456;
		do {
			num/=10;
			++count;
		}
		while(num!=0 ); 
		
			
		
		System.out.println("Number of digits in the given number is:" + count);

	}

}
