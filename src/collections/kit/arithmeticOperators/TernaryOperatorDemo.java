package collections.kit.arithmeticOperators;// Java program to find largest among two
// numbers using ternary operator

class TernaryOperatorDemo {
	public static void main(String[] args)
	{

		// variable declaration
		int n1 = 50, n2 = 100, max = 0;

		System.out.println("First num: " + n1);
		System.out.println("Second num: " + n2);

		// Largest among n1 and n2
		max = (n1 > n2) ? n1 : n2;

		/*if(n1>n2){
			max = n1;
		} else {
			max = n2;
		}*/

		// Print the largest number
		System.out.println("Maximum is = " + max);
	}
}
