package project1;

public class test1 {

	private static String final_dest =" "; 
	
	
	public String combine(String dest, String staff ){
		
		 final_dest = dest.concat(staff);	
		 
		 return final_dest;
		
	}	
	
	public void printResult(){
		System.out.println("= " + final_dest);		
		
	}
	

public static void main(String args[]){
	String my; 
	test1 AAA = new test1();
	my = AAA.combine("Hello", " ");
    AAA.combine(my, "World");
	AAA.printResult();
	
}

}


