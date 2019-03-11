import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame     i = new JFrame();
	JPanel     and = new JPanel();
	JButton    dont = new JButton();
	JButton    like = new JButton();
	JButton    sand = new JButton();
	JButton    its = new JButton();
	JTextField coarse = new JTextField();
	//         and
	JTextField rough = new JTextField();
	//         and
	String     irritating;
	//         and
	String     it;
	float        gets;
	float        everywhere;
	
	//     I
	//     have
	//     the
	String high = "";
	JLabel ground = new JLabel();
	// I don't like sand. It's coarse, and rough, and irritating, and it gets everywhere.
	 
	void run() {
		i.setDefaultCloseOperation(i.EXIT_ON_CLOSE);
		i.setVisible(true);
		i.setSize(420,200);
		i.add(and);
		dont.setText("Add");
		dont.addActionListener(this);
		like.setText("Subract");
		like.addActionListener(this);
		sand.setText("Multiply");
		sand.addActionListener(this);
	    its.setText("Divide");
	    its.addActionListener(this);
		coarse.setPreferredSize(new Dimension(200,50));
		and.add(coarse);
		rough.setPreferredSize(new Dimension(200,50));
		and.add(rough);
	//  irritating
		and.add(dont);
		and.add(like);
		and.add(sand);
		and.add(its);
		and.add(ground);
	//  it
	//  gets
	//  everywhere
	}
	public static void main(String[] args) {
		Calculator CalcRunner = new Calculator();
		CalcRunner.run();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton highGround = (JButton) e.getSource();
		it = rough.getText();
	    irritating = coarse.getText();
		gets = Float.parseFloat(it);
		everywhere = Float.parseFloat(irritating);
		if(highGround == dont) {
			high = String.valueOf(gets + everywhere);
		}else if(highGround == like) {
			high = String.valueOf(gets - everywhere);
		}else if(highGround == sand) {
			high = String.valueOf(gets * everywhere);
		}else if(highGround == its) {
			high = String.valueOf(gets / everywhere);
		}
		ground.setText(high);
	} 
}