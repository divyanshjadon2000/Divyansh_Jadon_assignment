package project;

public class Recursion {
	// recursion - a process in which a method calls itself continuously.
	static int count=0;  
	static void rec(){  
	count++;  
	if(count<=5){  
	System.out.println("hello "+count);  
	rec();  
	}  
	}  

	public static void main(String[] args) {
		// program for recursion in java         - for finite numbers       
		rec();
		

	}

}
