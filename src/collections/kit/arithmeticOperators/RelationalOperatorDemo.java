package collections.kit.arithmeticOperators;// Java Program to Illustrate equal to Operator

// Importing I/O classes

import java.util.ArrayList;
import java.util.List;

import static java.util.ArrayList.*;
// Main class
class RelationalOperatorDemo {

	// Main driver method
	public static void main(String[] args)
	{
		// Initializing variables
		int var1 = 5, var2 = 10, var3 = 5;
		List<String> l1 = new ArrayList<>();

		// Displaying var1, var2, var3
		System.out.println("Var1 = " + var1);
		System.out.println("Var2 = " + var2);
		System.out.println("Var3 = " + var3);

		// Comparing var1 and var2 and
		// printing corresponding boolean value
		System.out.println("var1 == var2: "
						+ (var1 == var2));  //false

		// Comparing var1 and var3 and
		// printing corresponding boolean value
		System.out.println("var1 == var3: "
						+ (var1 == var3));  //true

		// Comparing var1 and var2 and
		// printing corresponding boolean value
		System.out.println("var1 != var2: "
				+ (var1 != var2));  //true

		// Comparing var1 and var3 and
		// printing corresponding boolean value
		System.out.println("var1 != var3: "
				+ (var1 != var3));  //false
	}
}
