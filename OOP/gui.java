package whretg;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class gui {

	public static void main(String[] args) {
		JFrame frame = new JFrame("First frame in JAVA");
		frame.setLocation(200,200);
		frame.setSize(300,150);
		Button button1 = new Button("FIRST BUTTON");
		frame.add(button1, BorderLayout.NORTH);
		JButton button2 = new JButton("SECOND BUTTON");
		frame.add(button2, BorderLayout.SOUTH);
		JPanel pn = createpanelNxM(5);
		frame.add(pn);
		button2.setBackground(new Color(250,3,45));
		button2.setBackground(Color.BLUE);
		button2.setForeground(Color.WHITE);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static JPanel createpanelNxM(int n) {
		JPanel panel = new JPanel();
		GridLayout gl = new GridLayout(n,n);
		panel.setLayout(gl);
		Random rnd = new Random();
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if(i==j) {
				JButton b = new JButton(""+rnd.nextInt(10));
				b.setBackground(new Color(250-10*i, 150-j, 150));
				panel.add(b);
				}
				else {
					JButton b = new JButton("A"+rnd.nextInt(100));
					panel.add(b);
				}
			}
		}
		return panel;
	}// end panel method

}
