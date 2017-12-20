package javaStudy;

public class BizExam {

	public static void main(String[] args) {
		BizService biz = new BizService();
		biz.bizMethod(100);
		try {
			biz.bizMethod(-1);
		} catch (BizException e) {
			e.printStackTrace();
		}
	}

}
