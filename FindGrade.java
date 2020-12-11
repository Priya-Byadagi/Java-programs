class FindGrade{
     public static void main(String args[]){
		 System.out.println("Finding agrade for a percentage");
		 double percentage=125;   //float percentage =78.9f;
		 if(percentage>100 || percentage<0)
		 {
			 System.out.println("you have a given a wrong percentage");
		 } else 
		 {
		 
		 
		   if(percentage>85)
		   {
			    System.out.println("You have got A ");
		   }else if(percentage>=75 && percentage<=84)
		   {
			    System.out.println("You have got B");
		   }else if(percentage>=35 && percentage<=64)
		   { 
	            System.out.println("You have got C");
		   }else 
			    System.out.println("You have got D");
		 }
	 }
}
	 
			 