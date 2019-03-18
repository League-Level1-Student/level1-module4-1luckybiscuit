import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class hitSans implements ActionListener {
	JFrame bad = new JFrame();
	JPanel time = new JPanel();
	void teleportSans() {
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
		
	}
}
