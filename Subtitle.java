import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Panel;

public class Subtitle extends JFrame {
    public Subtitle() {
        setSize(300, 400);
        setTitle("GUI Fun Class");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //   setLocationRelativeTo(null);

        // Create panel
        JPanel panel= new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        
        JButton btn=new JButton("Click me");
        panel.add(btn);
        add(panel);
    }

    public static void main(String[] args) {
        Subtitle sub = new Subtitle();
        sub.setVisible(true);
    }
}
