package collections.kit.arithmeticOperators;// Java code to illustrate
// logical AND operator
public class LogicalOperatorDemo {

	public static void main(String[] args)
	{
		// initializing variables
		int a = 100, b = 20, c = 22, d = 0;
				// Displaying a, b, c
		System.out.println("Var1 = " + a);
		System.out.println("Var2 = " + b);
		System.out.println("Var3 = " + c);

		// using logical AND to verify
		// two constraints
		if ((a < b) || (b == c)) {
			d = a + b + c;
			System.out.println("The sum is: " + d);
		}
		else
			System.out.println("False conditions");
	}
}
