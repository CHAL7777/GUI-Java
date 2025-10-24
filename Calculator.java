import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    JButton add;
    JButton one, two;
    JTextField result;

    public Calculator() {
        setTitle("Simple Calculator Layout");
        setSize(400, 350);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        result = new JTextField(60);
        result.setBounds(50, 25, 300, 50);
        add(result);

        one = new JButton("1");
        one.addActionListener(this);

        two = new JButton("2");
        two.addActionListener(this);

        add = new JButton("+");
        add.addActionListener(this);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2, 3, 5, 5));
        p.setBounds(50, 80, 300, 200);

        p.add(one);
        p.add(two);
        p.add(add);

        add(p);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
        if (e.getSource() == one) {
            result.setText(result.getText() + "1");
        } else if (e.getSource() == two) {
            result.setText(result.getText() + "2");
        } else if (e.getSource() == add) {
            result.setText(result.getText() + "+");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
