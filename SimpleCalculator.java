
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    JButton[] numberButtton = new JButton[10];
    JButton[] functionButton = new JButton[8];
    JButton add, sub, multi, div, del, dec, clr, equal;
    JTextField result;
    double num1, num2, num3 = 0;
    char opration;

    public SimpleCalculator() {
        setSize(450, 550);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("SimpleCalculator");
        JPanel p = new JPanel();
        p.setBounds(50, 80, 300, 200);
        p.setLayout(new GridLayout(4, 3, 10, 10));
        for (int i = 1; i < 10; i++) {
            numberButtton[i] = new JButton(String.valueOf(i));
            numberButtton[i].addActionListener(new MyAction());
            p.add(numberButtton[i]);
        }
        p.add(numberButtton[0]=new JButton(String.valueOf(0)));
        add = new JButton("+");
        multi = new JButton("*");
        sub = new JButton("-");
        div = new JButton("/");
        equal = new JButton("=");
        clr = new JButton("ClR");
        dec = new JButton(".");
        del = new JButton("DEL");
        functionButton[0] = add;
        functionButton[1] = multi;
        functionButton[2] = sub;
        functionButton[3] = div;
        functionButton[4] = equal;
        functionButton[5] = clr;
        functionButton[6] = dec;
        functionButton[7] = del;
        p.add(multi);
        p.add(div);
        p.add(sub);
        p.add(add);
        p.add(dec);
        p.add(equal);

        for (int i = 0; i < 8; i++) {
            functionButton[i].addActionListener(new MyAction());

        }

        del.setBounds(50,400,100,50);
        clr.setBounds(200,400,100,50);
        result = new JTextField();
        result.setEditable(false);
        result.setBounds(50, 5, 300, 50);
        add(result);
        add(p);
        add(del);
        add(clr);
        setVisible(true);


    }

    class MyAction implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent actionEvent) {
       num3=num1+num2;
       

        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }


}

