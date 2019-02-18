import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int charCount = 0;
	char currentLetter;
	char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
	}
	Date timeAtStart = new Date();

	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	      Date timeAtEnd = new Date();
	      long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	      long gameInSeconds = (gameDuration / 1000) % 60;
	      double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	      int charactersPerMinute = (int) (charactersPerSecond * 60);
	      JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}

	void startType() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setTitle("T Y P E   O R    D I E");
		frame.setSize(500, 300);
		frame.add(panel);
		panel.add(label);
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
		label.setFont(label.getFont().deriveFont(50.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
		//frame.pack();
	}
	public static void main(String[] args) {
		TypingTutor h = new TypingTutor();
		h.startType();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
		if(e.getKeyChar() == currentLetter) {
			System.out.println("correct");
			panel.setBackground(new Color(0,255,0));
			charCount++;
		}else {
			System.out.println("wrong");
			panel.setBackground(new Color(255,0,0));
		}
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
		if(charCount == 20 || charCount == 40 || charCount == 60 ) {
			showTypingSpeed(charCount);
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
