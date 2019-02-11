import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton one = new JButton();
	JButton two = new JButton();
	void makeButtons() {
		JOptionPane.showMessageDialog(null, "Make Buttons!");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(200, 100);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(one);
		panel.add(two);
		one.addActionListener(this);
		two.addActionListener(this);
		one.setText("joke");
		two.setText("punchline");
	}
	public static void main(String[] args) {
		ChuckleClicker huckleHickler = new ChuckleClicker();
		huckleHickler.makeButtons();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == one) {
			JOptionPane.showMessageDialog(null, "If Jon is short for Jonathan...");
		}else {
			JOptionPane.showMessageDialog(null, "Is Sean short for Seanathan?");
		}
	}
}
