package javaStudy;

public class DuckExam {

	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.sing();
		duck.fly();
		
		// Bird는 추상 클래스 이므로 객체를 생성할 수 없다. 
		// Bird bird = new Bird();
	}
}
