class FindingNumberOfDigits{
     public static void main(String args[]){
		 int num=789;
		 if(num>=0 && num<10)
		 {
			 System.out.println("The given number is single Digit number:");
		 }
		 else if(num>=10&& num<100 )
		 {
			 System.out.println("The given number is 2digit number:");
		 }
		 else if(num>=100&&num<1000)
		 {
			  System.out.println("The given number is 3digit number:");
		 }
	 }
}
			 