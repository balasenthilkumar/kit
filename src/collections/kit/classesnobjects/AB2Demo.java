package collections.kit.classesnobjects;// Java program to convert Char to Int
// Using valueOf() method of String Class

// Class
class AB2Demo {

	// Main driver method
	public static void main(String[] args) {
		int i = 10; // primitive type
		Integer i2 = Integer.valueOf(i); // boxing - manual

		int j = i2.intValue(); // unboxing - manual

		String s = "123";

		System.out.println("String S = "+s);

		Integer ij = Integer.parseInt(s);

		System.out.println("int value = "+ ij);

		System.out.println(ij);
	}
}
