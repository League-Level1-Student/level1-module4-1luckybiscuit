import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class sirPrize implements ActionListener, MouseListener {
	JButton trick = new JButton();
	JButton treat = new JButton();
	public static void main(String[] args) {
		sirPrize surprise = new sirPrize();
		surprise.display();
	}
	
	public void display() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		//frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		panel.add(trick);
		panel.add(treat);
		//frame.pack();
		trick.setText("Trick");
		trick.addActionListener(this);
		//trick.setSize(100, 100);
		treat.setText("Treat");
		treat.addActionListener(this);
		treat.setPreferredSize(new Dimension(100,100));
		//treat.setSize(100, 100);
		trick.setPreferredSize(new Dimension(100,100));
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Clicked");
		JButton buttClicked = (JButton) e.getSource();
		if(buttClicked == trick) {
			showPictureFromTheInternet("https://www.picclickimg.com/d/l400/pict/160850474117_/Cute-Garfield-Standing-Plush-with-his-famous-grin.jpg");
		}else if(buttClicked == treat) {
			showPictureFromTheInternet("https://i.ytimg.com/vi/Z9q8O4N6h6U/maxresdefault.jpg");
		}
	}
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
