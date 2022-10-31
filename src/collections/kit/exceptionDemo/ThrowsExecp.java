package collections.kit.exceptionDemo;

// Java program to demonstrate working of throws
class ThrowsExecp
{
	void fun() throws IllegalAccessException
	{
		System.out.println("Inside fun(). ");
		throw new IllegalAccessException("demo");
	}

	void funCaller() throws IllegalAccessException {
		System.out.println("Inside funCaller()");
		fun();
	}

	public static void main(String[] args) {
		ThrowsExecp t1 = new ThrowsExecp();
		try {
			t1.funCaller();
		} catch (IllegalAccessException e) {
			System.out.println("catch block executed, since funcaller throws the exception");
		}
	}

}
