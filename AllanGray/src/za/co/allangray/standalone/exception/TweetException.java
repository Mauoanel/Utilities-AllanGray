/**
 * 
 */
package za.co.allangray.standalone.exception;

/**
 * @author Lawrence
 *
 */
public class TweetException extends Exception {

	/**
	 * Generate <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = -5227420140196220941L;

	/**
	 * Class constructor
	 */
	public TweetException() {
		super();
	}

	public TweetException(Exception e) {
		super(e);
	}
}
