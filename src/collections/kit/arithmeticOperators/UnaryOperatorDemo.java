package collections.kit.arithmeticOperators;// Java Program to Illustrate Unary - Operator

// Importing required classes

// Main class
class UnaryOperatorDemo {

	// Main driver method
	public static void main(String[] args)
	{
		// Declaring a custom variable
		int n1 = 20;

		// Printing the above variable
		System.out.println("Number = " + n1);

		// Performing unary operation
		//n1 = -n1;

		// Printing the above result number
		// after unary operation
		//System.out.println("Result = " + n1);

		//increment Operator used by next execution only
		System.out.println("Increment Result : "+ n1--);  // 21  and print it ie, pre increment
		System.out.println(n1);
	}
}
