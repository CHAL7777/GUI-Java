import com.jogamp.common.jvm.JNILibLoaderBase;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class Myframe extends JFrame {
   public Myframe(){
       setSize(500,500);

       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       getContentPane().setBackground(new Color(100,100,124));
       setVisible(true);
       setLayout(new BorderLayout());

       JPanel panel1= new JPanel();
       JPanel panel2= new JPanel();
       JPanel panel3= new JPanel();
       JPanel panel4= new JPanel();
       JPanel panel5= new JPanel();

       JPanel panel6= new JPanel();
       JPanel panel7= new JPanel();
       JPanel panel8= new JPanel();
       JPanel panel9= new JPanel();
       JPanel panel10= new JPanel();

       panel1.setBackground(Color.blue);
       panel2.setBackground(Color.green);
       panel3.setBackground(Color.magenta);
       panel4.setBackground(Color.gray);
       panel5.setBackground(Color.lightGray);

       panel1.setPreferredSize(new Dimension(100,100));
       panel2.setPreferredSize(new Dimension(100,100));
       panel3.setPreferredSize(new Dimension(100,100));
       panel4.setPreferredSize(new Dimension(100,100));
       panel5.setPreferredSize(new Dimension(100,100));



       panel6.setBackground(Color.white);
       panel7.setBackground(Color.cyan);
       panel8.setBackground(Color.yellow);
       panel9.setBackground(Color.darkGray);
       panel10.setBackground(Color.lightGray);

       panel3.setLayout(new BorderLayout());
       panel6.setPreferredSize(new Dimension(50,50));
       panel7.setPreferredSize(new Dimension(50,50));
       panel8.setPreferredSize(new Dimension(50,50));
       panel9.setPreferredSize(new Dimension(50,50));
       panel10.setPreferredSize(new Dimension(50,50));


       panel3.add(panel6,BorderLayout.WEST);
       panel3.add(panel7,BorderLayout.SOUTH);
       panel3.add(panel8,BorderLayout.EAST);
       panel3.add(panel9,BorderLayout.NORTH);
       panel3.add(panel10,BorderLayout.CENTER);

       add(panel1,BorderLayout.NORTH);
       add(panel2,BorderLayout.SOUTH);
       add(panel3,BorderLayout.CENTER);
       add(panel4,BorderLayout.WEST);
       add(panel5,BorderLayout.EAST);




   }

}
