import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class TweetYeet implements ActionListener {
	JFrame     I = new JFrame();
	JPanel     have = new JPanel();
	//         the
	JTextField high = new JTextField();
	JButton    ground = new JButton();
	void tweet() {
		I.add(have);
		I.setVisible(true);
		I.setDefaultCloseOperation(I.EXIT_ON_CLOSE);
		I.setSize(500, 200);
		have.add(high);
		have.add(ground);
	//  the
	    high.setPreferredSize(new Dimension(450, 100));
		ground.setText("Into the Twitterverse");
		ground.addActionListener(this);
	}
	public static void main(String[] args) {
		TweetYeet yeetweet = new TweetYeet();
		yeetweet.tweet();
	}
	private String getLatestTweet(String searchingFor) {

	      Twitter twitter = new TwitterFactory().getInstance();

	      AccessToken accessToken = new AccessToken(
	            "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
	            "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");

	      twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
	            "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");

	      twitter.setOAuthAccessToken(accessToken);

	      Query query = new Query(searchingFor);
	      try {
	            QueryResult result = twitter.search(query);
	            return result.getTweets().get(0).getText();
	      } catch (Exception e) {
	            System.err.print(e.getMessage());
	            return "What the heck is that?";
	      }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Tweet, tweet, yeet, yeet");
		System.out.println(getLatestTweet(high.getText()));
	}



}
