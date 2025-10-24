import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Buttons extends JFrame implements ActionListener {
    JRadioButton male, female,others;
    JTextField result;


    public Buttons() {
        setTitle("Gender Selection");
        setLayout(null);
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    
        result = new JTextField();
        result.setBounds(50, 20, 300, 40);
        result.setEditable(false);
        add(result);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
   others=new JRadioButton("others");
 
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
      bg.add(others);
      
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1, 2, 10, 10));
        p.setBounds(50, 80, 300, 40);
        p.add(male);
        p.add(female);
        p.add(others);
        add(p);

    others.addActionListener(this);
        male.addActionListener(this);
        female.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == male) {
            result.setText("your gender is Male");
        } else if (e.getSource() == female) {
            result.setText("you gender is female");
        }
        else if(e.getSource()==others){
result.setText("you slected others");
        }
    }

    public static void main(String[] args) {
        new Buttons();
    }
}
