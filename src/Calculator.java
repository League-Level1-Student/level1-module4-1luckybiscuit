import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	JFrame i = new JFrame();
	JPanel hate = new JPanel();
	JButton sand = new JButton();
	JButton its = new JButton();
	JButton coarse = new JButton();
	JButton rough = new JButton();
	JTextField irritating = new JTextField();
	JTextField and = new JTextField();
	
	void run() {
		i.setDefaultCloseOperation(i.EXIT_ON_CLOSE);
		i.setVisible(true);
		i.setSize(500,200);
		i.add(hate);
		hate.add(irritating);
		hate.add(and);
		hate.add(sand);
		hate.add(its);
		hate.add(coarse);
		hate.add(rough);
		irritating.setEditable(true);
		and.setEditable(true);
		sand.setText("Add");
		its.setText("Subract");
		coarse.setText("Multiply");
	    rough.setText("Divide");
	}
	public static void main(String[] args) {
		Calculator CalcRunner = new Calculator();
		CalcRunner.run();
	} 
}