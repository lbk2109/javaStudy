package javaStudy;

public interface TV {
	public int MAX_VOLUME = 100;
	public int MIN_VOLUME = 0;

//	인터페이스에서 변수를 선언하면 컴파일시 자동으로 아래와 같이 바뀐다.
//	public static final int MAX_VOLUME = 100;
//	public static final int MIN_VOLUME = 0;

	public void trunOn();

	public void turnOff();

	public void changeVolume(int volume);

	public void changeChannel(int channel);
	
//  인터페이스에서 정의된 메소드는 모두 추상 메소드이다. 위에서 선언된 모든 메소드는 컴파일 시에 다음과 같이 자동으로 변경된다.
//  public abstract void trunOn();
//  public abstract void turnOff();
//  public abstract void changeVolume(int value);
//  public abstract void changeChannel(int number);
	
}
