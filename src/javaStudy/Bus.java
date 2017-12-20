package javaStudy;

public class Bus extends Car {
    int fee;
	public Bus() {
		super();
	}
	public Bus(String name, int number, int fee) {
		super(name, number);
		this.fee = fee;
	}
	
	public Bus(String name, int number) {
		super(name, number);
	}

	public Bus(String name) {
		super(name);
	}
	@Override
	public void run() {
//		super.run();
		System.out.println("버스가가 달립니다.");
	}
	@Override
	public void stop() {
//		super.stop();
		System.out.println("버스가 멈춥니다.");
	}
	
	public void PpangPpang()
	{
		System.out.println("빵빵~~!");
	}

}
