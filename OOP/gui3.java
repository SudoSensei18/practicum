import javax.swing.*;
public class gui3 {

	public static void main(String[] args) {
	String name = JOptionPane.showInputDialog(null, "Your name?", "Input", JOptionPane.QUESTION_MESSAGE);
	
	String years = JOptionPane.showInputDialog(null, "How old are you", "Input", JOptionPane.QUESTION_MESSAGE);
	
	String years1 = JOptionPane.showInputDialog(null, "In which year of studying are you enrolled", "Input", JOptionPane.QUESTION_MESSAGE);
	
	int year = Integer.parseInt(years);
	int year1 = Integer.parseInt(years1);
	
	String message = "Well, i know you! You are"+name+ "and you are\n";
	message += year + "old. You go to FAMNIT and you are \n";
	message += year1 + ". year of studying. \nNice to meet you!";
	JOptionPane.showMessageDialog(null, message,"output", JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);

	}

}
