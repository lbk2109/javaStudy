package javaStudy;

//RuntimeException:Unchecked exception
//Exception:Checked exception
public class BizException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BizException(String msg) {
		super(msg);
	}

	public BizException(Exception e) {
		super(e);
	}
}
