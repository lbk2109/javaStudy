package javaStudy;

public class CarExam {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		
		System.out.println(c1.name);
		System.out.println(c2.name);
		
		c1.name = "hello";
		c2.name = "hello";
		
		System.out.println(c1.name.equals(c2.name)); //true
		System.out.println(c1.name==c2.name);  //true

		Car c3 = new Car();
		Car c4 = new Car();

		c3.name = new String("hello");
		c4.name = new String("hello");
		
		System.out.println(c3.name.equals(c4.name)); //true
		System.out.println(c3.name == c4.name);  //false
		
		
	}

}
