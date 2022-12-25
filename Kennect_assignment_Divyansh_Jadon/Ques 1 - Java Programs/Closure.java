package project;

public class Closure {
	public static void main(String[] args) {
		// closure - closure is a function (or method) that refers to free variables in their lexical context.
		int n = 0;
		final int k = n; 
		Runnable r = () -> { // Using lambda
		    int i = k;
		    // do something
		};
		n++;     
		r.run(); // will not generate any error
	}
}
