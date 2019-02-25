import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int sicko = new Random().nextInt(4);
	// 3. Print out this variable
	//System.out.println(sicko);
	// 4. Get the user to enter a question for the 8 ball
	//JOptionPane.showInputDialog("What questions do you have for the 8 Ball?");
	// 5. If the random number is 0
	if(sicko == 0) {
	// -- tell the user "Yes"
		JOptionPane.showMessageDialog(null, "Yes");
	}
	// 6. If the random number is 1
	if(sicko == 1) {
	// -- tell the user "No"
		JOptionPane.showMessageDialog(null, "No");
	}
	// 7. If the random number is 2
	if(sicko == 2) {
	// -- tell the user "Maybe you should ask Google?"
	JOptionPane.showMessageDialog(null, "I don't know, Google it or something");
	}
	// 8. If the random number is 3
	if(sicko == 3) {
	// -- write your own answer
	JOptionPane.showMessageDialog(null, "If it is true for Barack Obama, then it is true for you.");
	}
	}
}
