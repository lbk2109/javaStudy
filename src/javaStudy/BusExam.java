package javaStudy;

public class BusExam {
	public static void main(String[] args) {
		Bus bus = new Bus("뛰뛰", 3000, 1050);
		if (bus.name != "뛰뛰") {
			System.out.println("bus의 name이 다릅니다.");
		} else if (bus.number != 3000) {
			System.out.println("bus의 number가 다릅니다.");
		} else if (bus.fee != 1050) {
			System.out.println("bus의 fee가 다릅니다.");
		} else {
			System.out.println("정답입니다. [제출]을 누르세요.");
		}
		
		bus.run();
		bus.stop();
		
		Car c = new Bus();
		c.run();		
		//c.PpangPpang(); 자식이 가지고 있으나 사용할수 없음.
		
		Bus c1 = (Bus)c;
		c1.PpangPpang(); //부모크래스 타입을 자식크래스 타입으로 형 변환해서 사용 
		

	}
}
