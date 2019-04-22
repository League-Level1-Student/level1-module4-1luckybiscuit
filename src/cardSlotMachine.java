import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class cardSlotMachine implements ActionListener {
		JFrame I = new JFrame();
		JPanel think = new JPanel();
		private AudioClip sound;
		int winCount = 0;
		void motomoto() {
			think = new JPanel();
			I.add(think);
			I.setVisible(true);
			I.setDefaultCloseOperation(I.EXIT_ON_CLOSE);
			//JLabel spacer = new JLabel();
			//spacer.setPreferredSize(new Dimension(550, 20));
			JButton plumpy = new JButton();
			plumpy.setText("SPIN");
			plumpy.addActionListener(this);
			plumpy.setPreferredSize(new Dimension(50, 20));
			think.add(plumpy);	
			JLabel big = new JLabel();
			big.setText("Wins: " + String.valueOf(winCount));
			big.setPreferredSize(new Dimension(1050, 20));
			think.add(big);
			I.pack();
		    }
		int kowalski() {
			Random yeet = new Random();
			int yacht = yeet.nextInt(3);
			if(yacht == 0) {
				think.add(loadImageFromComputer("marioCard.jpg"));
			}else if(yacht == 1) {
				think.add(loadImageFromComputer("minecraftCard.jpg"));
			}else if(yacht == 2) {
				think.add(loadImageFromComputer("garfieldCard.jpg"));
			}
			return yacht;
		}
		public static void main(String[] args) {
			cardSlotMachine chunky = new cardSlotMachine();
			chunky.playSound("victoryRoyale.mp3");
			chunky.motomoto();
		}
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				I.dispose();
				I.remove(think);
				motomoto();
				int yote = kowalski();
				int yate = kowalski();
				int yoot = kowalski();
				think.setPreferredSize(new Dimension(1150,550));
				I.pack();
				if(yote == yate && yate == yoot) {
					JOptionPane.showMessageDialog(null, "You Win!!!");
					winCount++;
				}
			}
		public JLabel loadImageFromComputer(String fileName) {
				URL imageURL = getClass().getResource(fileName);
				Icon icon = new ImageIcon(imageURL);
				return new JLabel(icon);
				
		}
		private void playSound(String fileName) {
		     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		     sound.play();
		}
}
