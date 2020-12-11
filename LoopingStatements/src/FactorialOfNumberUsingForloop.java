
public class FactorialOfNumberUsingForloop {

	public static void main(String[] args) {
		
		int  fact=1,num=5;
		for(int i=1;i<=num;i++) {
			fact*=i;     //fact=fact*i;
		}
		System.out.println("Factorial of a given number "+num+" is: "+fact);
		

	}

}
