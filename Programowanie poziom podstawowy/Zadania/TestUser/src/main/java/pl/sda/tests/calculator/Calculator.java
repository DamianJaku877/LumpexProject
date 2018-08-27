package pl.sda.tests.calculator;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public Double divide(Double a, Double b) {
		if (a == 0 || b == 0) {
			throw new ArithmeticException("Incorrect value");
		}

		return a / b;
	}
}
