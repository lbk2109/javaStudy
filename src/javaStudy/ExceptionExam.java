package javaStudy;

public class ExceptionExam {

	// 메소드 선언 뒤에 throws ArithmeticException 이 적혀있는 것을 알 수 있습니다.
	// 이렇게 적어놓으면 divide메소드는 ArithmeticException이 발생하니
	// divide메소드를 호출하는 쪽에서 오류를 처리하라는 뜻입니다.
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
			int k = divide(i, j);
			System.out.println(k);
		} catch (Exception e) {
//			} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다."+e.toString());
		} finally {
			System.out.println("End!");
		}
	}

	public static int divide(int i, int j) throws Exception {
//	public static int divide(int i, int j) throws ArithmeticException {
		int k = i / j;
		return k;
	}
}
