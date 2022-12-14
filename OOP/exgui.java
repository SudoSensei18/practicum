package oop;
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class exgui {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Frame with comp.");
		frame.setBounds(500,400,320,200);
		JPanel p = new JPanel();
		JButton jb = new JButton("ok");
		JLabel jlabel = new JLabel("Insert your name");
		JTextField jtf = new JTextField("Write something");
		JCheckBox jcb = new JCheckBox("Student");
		JRadioButton  jrb = new JRadioButton("Employer");
		JComboBox jcbox = new JComboBox(new String[] {"First", "Second", "Third"});
		p.add(jb);
		p.add(jlabel);
		p.add(jtf);
		p.add(jcb);
		p.add(jrb);
		p.add(jcbox);
		frame.add(p);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
