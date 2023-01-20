package com.bridgelabz.generics;

public class MaximumTestGenerics<T> {
	T num1, num2, num3;

	/*
	 * Here i have used Generic functions. T is the type of data. then used compare
	 * to method
	 */
	public static <T extends Comparable<T>> T maximumAmongThree(T num1, T num2, T num3) {

		T maximumNumber = num1;
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
			maximumNumber = num1;
		else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
			maximumNumber = num2;
		else
			maximumNumber = num3;
		return maximumNumber;
	}
	// print maximum of three methods

	public static void main(String[] args) {
		System.out.println(
				"The max Number Among Three String numbers is:-\n " + maximumAmongThree("Papaya", "Apple", "Mango"));
		System.out.println("The max Number Among Three Integer numbers is:-\n " + maximumAmongThree(70, 40, 50));
		System.out.println("The max Number Among Three Float numbers is:-\n " + maximumAmongThree(70.6f, 40.7f, 50.8f));
	}
}
