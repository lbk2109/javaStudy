package javaStudy;
/**
 * 
 * 학습목표
 *변수 str1과 변수 str2 에 저장된 문자열을 붙여서 변수 concatResult 에 저장하세요. 
 *변수 str1 이 레퍼런스하는 문자열을 2번째 인덱스부터 잘라서 subStringResult 변수에 저장하세요. 
 *
 */
public class StringExam {
	public static void main(String[] args) {
		String str1 = "안녕하세요. ";
		String str2 = "벌써 여기까지 오셨네요. 끝까지 화이팅!!";

		String concatResult;
		String substringResult;

		// 아래쪽에 코드를 작성하세요.
		concatResult = str1.concat(str2);
		substringResult = str1.substring(2);

		// 이 아래는 정답 확인을 위한 코드입니다. 수정하지 마세요.
		System.out.println(concatResult);
		System.out.println(substringResult);
	}

}