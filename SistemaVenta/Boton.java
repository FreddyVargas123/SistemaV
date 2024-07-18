
import javax.swing.*;
public class Boton extends JButton
{
    
    public Boton(String txt, int px, int py )
    {
        setText(txt);
        setSize(100, 35);
        setLocation(px, py);
    }
}
