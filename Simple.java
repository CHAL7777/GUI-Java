import javax.swing.*;

public class Simple extends JFrame{
    public Simple(){

        setTitle("simple Frame ");
        setSize(400,300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Simple();
    }
}