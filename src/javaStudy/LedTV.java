package javaStudy;

public class LedTV implements TV {

	@Override
	public void trunOn() {
		System.out.println(this.getClass().getSimpleName()+"를 켜졌습니다.");
	}

	@Override
	public void turnOff() {
		System.out.println(this.getClass().getSimpleName()+"가 꺼졌습니다.");
	}

	@Override
	public void changeVolume(int volume) {
		System.out.println("볼륨을 "+ volume+ "로 조정 하였습니다.");

	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("체널을 "+ channel+ "로 변경 하였습니다.");

	}
	
	public void aplyLedColor()
	{
		System.out.println(this.getClass().getSimpleName()+"만의 특성을 적용 하였습니다.");
	}

}
