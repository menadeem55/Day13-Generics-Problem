package com.bridgelabz.generics;

public class MaximumTestGenerics<T> {

	/**
	 * here used Generic functions. here T is the type of data. Gradually it will
	 * return the maximum.
	 */
	T num1, num2, num3;

	public MaximumTestGenerics(T num1, T num2, T num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public static <T extends Comparable<T>> T MaximumAmongThree(T num1, T num2, T num3) {

		T maximum = num1;
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
			maximum = num1;
		else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
			maximum = num2;
		else
			maximum = num3;
		return maximum;

	}

	// print maximum Float numbers
	public static void main(String[] args) {
		System.out.println("The max Number Among Three String numbers is:-\n "
				+ MaximumAmongThree("Orange", "Dragonfruit", "Apple"));
		System.out.println("The max Number Among Three Integer numbers is:-\n " + MaximumAmongThree(14, 56, 27));
		System.out.println("The max Number Among Three Float numbers is:-\n " + MaximumAmongThree(39.6f, 78.7f, 99.8f));
	}

}