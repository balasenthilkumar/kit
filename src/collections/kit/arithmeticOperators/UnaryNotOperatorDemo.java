package collections.kit.arithmeticOperators;// Java Program to Illustrate Unary NOT Operator

// Importing required classes

// Main class
class UnaryNotOperatorDemo {

	// Main driver method
	public static void main(String[] args)
	{
		// Initializing variables
		boolean cond = true;
		int a = 10, b = 1;

		// Displaying values stored in above variables
		System.out.println("Cond is: " + cond);
		System.out.println("Var1 = " + a);
		System.out.println("Var2 = " + b);

		// Displaying values stored in above variables
		// after applying unary NOT operator
		System.out.println("Now cond is: " + !cond); //we have added logical NOT operaotr   !
		System.out.println("!(a < b) = " + !(a < b)); // 10<1 ? false
		System.out.println("!(a > b) = " + !(a > b)); // 10>1 ? true

		System.out.println(a+=b);
	}
}
