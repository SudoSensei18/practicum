import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {


    JButton button1;
    JButton button2;
    int buttonVal = 16;
    MyFrame(){

        button1 = new JButton();
        button2 = new JButton(" "+buttonVal);

        button1.setSize(new Dimension(200,200));

        button1.setText("Close");
        button2.setSize(new Dimension(200,200));
        button2.setText("16");

        button1.addActionListener(this);
        button2.addActionListener(this);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,200);
        this.setVisible(true);
        this.setLayout(new BorderLayout());

        this.add(button1, BorderLayout.NORTH);
        this.add(button2, BorderLayout.SOUTH);



    }

    @Override

    public void actionPerformed(ActionEvent e){

        if(e.getSource()==button1){
            System.exit(0);
        } if (e.getSource()==button2) {

            do {
                buttonVal =buttonVal / 2;
                button2.setLabel(""+buttonVal);
            } while (buttonVal < 1);


        }


    }
}
