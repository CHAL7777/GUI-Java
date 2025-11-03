import javax.swing.*;
import java.awt.*;

public class ButtonRowExample {

    public static void main(String[] args) {
        JFrame frame=new JFrame("hey this ");
        frame.setSize(400,300);
       
        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout());

        JButton btn1=new JButton("1");
        JButton btn2=new JButton("2");
        JButton btn3=new JButton("3");
        JButton btn4=new JButton("4");

        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);

        frame.add(panel);
         frame.setVisible(true);
    }
}