class BitwiseOperators{
public static void main(String args[]){
	System.out.println("Program to illusttate a bitwise operators");
	int a=10,b=20;
	System.out.println("The result of bitwise and operator is:"+(a&b));
	System.out.println("The result of bitwise or operator is:"+(a|b));
	System.out.println("The result of bitwise xor operator is:"+(a^b));
	System.out.println("The result of bitwise compliment operator is:"+~a);
	System.out.println("The result of bitwise compliment operator is:"+~b);
	System.out.println("The result of left shift operator is:"+(a<<2));
	System.out.println("The result of right shift operator is:"+(a>>2));
	

}
}