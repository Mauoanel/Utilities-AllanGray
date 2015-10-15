/**
 * 
 */
package za.co.allangray.standalone.interf;

import java.io.IOException;
import java.util.List;
import java.util.TreeSet;

/**
 * @author Lawrence
 *
 */
public interface TwitterFeedInterface {


	/**
	 * This method compiles a list of user followers.
	 * 
	 * @param users
	 *            - name of the user
	 * @return a list of followers.
	 */
	public List<String> getFollowers(String users);

	/**
	 * * This method extracts the list of twitter users and compiles a list of
	 * followers a user has.
	 * 
	 * @param twitterUsrs
	 *            - list of twitter users
	 */
	public void processUserFollowers(List<String> twitterUsrs);

	/**
	 * Start processing the files and populate data objects accordingly. This
	 * method calls the <code>readSmallTextFile</code> to read the files and
	 * return a list of file contents
	 */
	public void startProcess();

	/**
	 * Determines if the user being followed, follows anyone.
	 * 
	 * @param twitterUsrs
	 *            - list of twitter users.
	 */
	public void isUserFollowingOtherUsers(List<String> twitterUsrs);

	/**
	 * This method loops through the usernames and then displays the twitter
	 * feeds alphabetically.
	 */
	public void processUserTwitterFeed();

	/**
	 * This method determines who follows who and then displays the feeds of the
	 * user.
	 * 
	 * @param username
	 *            - name of the user.
	 * @param followers
	 *            - list of followers.
	 */
	public void displayUserFeed(String username, List<String> followers);

	/**
	 * This method formats and displays the feeds.
	 * 
	 * @param tempFeeds
	 *            a sorted set of feed.
	 */
	public void formatAndDisplayFeed(TreeSet<String> tempFeeds);

	/**
	 * This method extracts the user name of the user being followed.
	 * 
	 * @param users
	 *            - name of the user.
	 * @return
	 */
	public String getUsername(String users);

	/**
	 * This method reads a text file, using Java.io Scanner. Used try with
	 * resource so as there is an AutoClosable to the Scanner.
	 * 
	 * @param fileName
	 *            - name of the file.
	 * @throws IOException
	 *             - exception thrown, should there be anything wrong with
	 *             processing the file.
	 */
	public void readTextFileAlternate(String fileName) throws IOException;

	/**
	 * Log the FEED.
	 * 
	 * @param aMsg
	 *            object holding the string value.
	 */
	void log(Object aMsg);
}
