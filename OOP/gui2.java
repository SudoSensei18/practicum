import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class gui2 {
	
	static int counter;
	static JLabel label = new JLabel("The value of the counter is: "+counter);
	public static void main(String[] args) {
		JFrame frame = new JFrame("Frame with a counter");
		frame.setBounds(500,500,300,400);
		JButton button = new JButton("INCREASE");
		//adding actionListener to button:
	
		button.addActionListener(e->{
			counter++;
			label.setText("After increasing the value of the counter is:"+counter);
		});
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
		frame.add(button);
		frame.add(label);
		JButton button1 = new JButton("DECREASE");
		button.setText(String.valueOf(1));
		button1.addActionListener(new ActionListener(){
			@Override 
			
			public void actionPerformed(ActionEvent e) {
				counter--;
				label.setText("The value of the counter after decreasing is:"+counter);
				button.setBackground(Color.BLUE);
				
			}
			
		});
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(3);

	}

}
