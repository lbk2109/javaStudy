package javaStudy;

public class LedTVExam {

	public static void main(String[] args) {
		
		TV tv = new LedTV();
		
		tv.trunOn();
		tv.changeChannel(15);
		tv.changeVolume(6);
		tv.turnOff();
		
		System.out.println("=============================");
		tv.trunOn();
		tv.changeChannel(15);
		tv.changeVolume(6);
		//
		LedTV ltv = (LedTV)tv;
		ltv.aplyLedColor(); 
		//
		tv.turnOff();

	}

}
