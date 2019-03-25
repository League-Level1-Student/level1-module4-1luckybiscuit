import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class cardSlotMachine implements ActionListener {
		JFrame I = new JFrame();
		JPanel think = new JPanel();
		void motomoto() {
			think = new JPanel();
			I.setPreferredSize(new Dimension(1250,600));
			I.add(think);
			I.setVisible(true);
			I.setDefaultCloseOperation(I.EXIT_ON_CLOSE);
			JButton plumpy = new JButton();
			plumpy.setText("SPIN");
			plumpy.addActionListener(this);
			think.add(plumpy);	
			I.pack();
		    }
		void kowalski() {
			Random yeet = new Random();
			int yacht = yeet.nextInt(3);
			if(yacht == 0) {
				think.add(loadImageFromComputer("marioCard.jpg"));
			}else if(yacht == 1) {
				think.add(loadImageFromComputer("minecraftCard.jpg"));
			}else if(yacht == 2) {
				think.add(loadImageFromComputer("garfieldCard.jpg"));
			}
		}
		public static void main(String[] args) {
			cardSlotMachine chunky = new cardSlotMachine();
			chunky.motomoto();
		}
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				I.dispose();
				I.remove(think);
				motomoto();
				kowalski();
				kowalski();
				kowalski();
				I.pack();
			}
		public JLabel loadImageFromComputer(String fileName) {
				URL imageURL = getClass().getResource(fileName);
				Icon icon = new ImageIcon(imageURL);
				return new JLabel(icon);
		}
}
