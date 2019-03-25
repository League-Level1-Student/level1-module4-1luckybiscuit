import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class hitSans implements ActionListener {
	JFrame bad = new JFrame();
	JPanel time = new JPanel();
	int tries = 0;
	int hit = 0;
	int miss = 0;
	void teleportSans() {
		time = new JPanel();
		Random epic = new Random();
		int gamer = epic.nextInt(100);
		bad.setPreferredSize(new Dimension(810,375));
		bad.add(time);
		bad.setVisible(true);
		bad.setDefaultCloseOperation(bad.EXIT_ON_CLOSE);
		for(int despacito = 0;despacito < 100;despacito++) {
			JButton e = new JButton();
			if(gamer == despacito) {
				e.setText("Sans");
			}
			e.addActionListener(this);
			time.add(e);	
		}
		bad.pack();
	}
	public static void main(String[] args) {
		hitSans bigVans = new hitSans();
		bigVans.teleportSans();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton spaghetti = new JButton();
		spaghetti = (JButton) e.getSource();
		if(spaghetti.getText().equals("Sans")) {
			playSound("voice_sans.mp3");
		}else {
			miss++;
			if(miss == 1) {
				System.out.println("It's a beautiful day outside");
				speak("Sans");
			}else if(miss == 2) {
				System.out.println("Bird's are singing");
				speak("Befriended");
			}else if(miss == 3) {
				System.out.println("Flowers are blooming");
				speak("Your");
			}else if(miss == 4) {
				System.out.println("On days like this, kids like you...");
				speak("Mom");
			}else if(miss == 5) {
				System.out.println("This joke isn't funny");
				speak("AAAAAAAAAAAAAAAA");
				JOptionPane.showMessageDialog(null, "Looks like you didn't have enough determination to beat Sans.");
				System.exit(0);
			}
		}
		tries++;
		bad.dispose();
		bad.remove(time);
		teleportSans();
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
