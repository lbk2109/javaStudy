package javaStudy;

public class MyCalculator implements Calculator {

	@Override
	public int plus(int i, int j) {
		return i+j;
	}

	@Override
	public int multiply(int i, int j) {
		return i*j;
	}

}
