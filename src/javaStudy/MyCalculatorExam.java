package javaStudy;

public class MyCalculatorExam {

	public static void main(String[] args) {
		MyCalculator mycalculator = new MyCalculator();
		System.out.println(mycalculator.plus(2, 3));
		System.out.println(mycalculator.multiply(2, 3));
		
		//default method
		System.out.println(mycalculator.exec(2, 3)); // override 또한 가능함.
		
        // static method		
		System.out.println(Calculator.exec2(5, 10)); // 스태틱한 방법으로만 사용가능
		
	}
}
