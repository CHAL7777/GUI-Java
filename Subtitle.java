import javax.swing.JFrame;
public class Subtitle extends JFrame{
   public  Subtitle() {
      setSize(300,300);
      setTitle("the swing ");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
      
   }
   public static void main(String[] args) {
     Subtitle sub= new Subtitle();
     sub.setVisible(true);
      
   }
}
