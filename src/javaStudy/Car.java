package javaStudy;

public class Car {
	String name;
	int number;
	public int gas;
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	public Car() {
		this("이름없음",0);
//		System.out.println("Car의 기본생성자 입니다.");
	}
	public Car(String name) {
		this(name,0);
	}
	
	//
	public void run(){
		System.out.println("차가 달립니다.");
	}

	public void stop(){
		System.out.println("차가 멈춥니다.");
	}
}
