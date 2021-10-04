import java.awt.*;
import javax.swing.JFrame;
public class Circle extends Canvas {
    public void paint(Graphics g){
        g.setColor(Color.GREEN);
       //g.drawRoundRect(40, 50, 90, 90, 200, 200);
        g.fillRoundRect(40, 50, 90, 90, 200, 200);

    }
    public static void main(String [] args)
    {
        JFrame win = new JFrame("Circle");
        win.setSize(300,300);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Circle canvas = new Circle();
        win.add(canvas);
        win.setVisible(true);
    }
}
