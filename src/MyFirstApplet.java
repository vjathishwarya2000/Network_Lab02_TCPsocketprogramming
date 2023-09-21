import javax.swing.*;
import java.awt.*;
public class MyFirstApplet extends JApplet{

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Hello applet!", 50, 30);
    }
}
