import javax.swing.*;
import java.awt.*;

public class Layout extends JFrame {
    public Layout() {
        setSize(400, 200);
        setTitle("GridLayout Fixed");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(2, 1)); // 2 rows: one for each name line

        // First row
        JPanel firstRow = new JPanel(new FlowLayout(FlowLayout.LEFT));
        firstRow.add(new JLabel("First Name:"));
        firstRow.add(new JTextArea(1, 10));

        // Second row
        JPanel secondRow = new JPanel(new FlowLayout(FlowLayout.LEFT));
        secondRow.add(new JLabel("Last Name:"));
        secondRow.add(new JTextArea(1, 10));

        add(firstRow);
        add(secondRow);
    }

    public static void main(String[] args) {
        Layout layout = new Layout();
        layout.setVisible(true);
    }
}
