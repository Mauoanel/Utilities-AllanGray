/**
 * 
 */
package za.co.allangray.standalone.utils;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @author Lawrence
 *
 */
public class ResourceUtils {

	private static final String TWEET_FILE = "src/tweet2.txt";
	private static final String USERS = "src/user2.txt";
	private static final Charset ENCODING = StandardCharsets.UTF_8;
	private static final String EMPTY_STRING = "";
	private static final String SPACE = " ";
	private static final String FOLLOWS = "follows";
	private static final int ZERO_INDEX = 0;
	private static final String COMMA = ",";
	private static final String TAB = "\t";
	private static final String AT = "@";
	private static final String GT = ">";

	/**
	 * Class constructor.
	 */
	public ResourceUtils() {
		super();
	}

	/**
	 * @return the tweetFile
	 */
	public String getTweetFile() {
		return TWEET_FILE;
	}

	/**
	 * @return the users
	 */
	public String getUsers() {
		return USERS;
	}

	/**
	 * @return the encoding
	 */
	public Charset getEncoding() {
		return ENCODING;
	}

	/**
	 * @return the emptyString
	 */
	public String getEmptyString() {
		return EMPTY_STRING;
	}

	/**
	 * @return the space
	 */
	public String getSpace() {
		return SPACE;
	}

	/**
	 * @return the follows
	 */
	public String getFollows() {
		return FOLLOWS;
	}

	/**
	 * @return the zeroIndex
	 */
	public int getZeroIndex() {
		return ZERO_INDEX;
	}

	/**
	 * @return the comma
	 */
	public String getComma() {
		return COMMA;
	}

	/**
	 * @return the tab
	 */
	public String getTab() {
		return TAB;
	}

	/**
	 * @return the at
	 */
	public String getAt() {
		return AT;
	}

	/**
	 * @return the gt
	 */
	public String getGt() {
		return GT;
	}

}
