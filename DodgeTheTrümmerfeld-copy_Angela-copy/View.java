
import javax.swing.*;
import java.awt.*;

public class View extends JComponent implements ModelBeobachter
{
    private Raumschiff raumschiff;
    private JFrame fenster;

    public View(Raumschiff r){
        raumschiff = r;
        r.anmelden(this);        
        setFocusable(true);
        fenster = new JFrame("Dodge The Trümmerfeld");
        fenster.add(this);
        fenster.setSize(1950, 1100);
        fenster.setBackground(Color.RED); //setzt die Hintergundfarbe
        //fenster.setExtendedState(JFrame.MAXIMIZED_BOTH); //startet in Vollbild
        fenster.setUndecorated(false);      //entfernt den Ramen wenn auf true
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setVisible(true);
    }

    public void raumschiffGeaendert(){
        repaint();
    }
    
    public void asteroidGeaendert(){
        repaint();
    }

    public void entergedrückt()
    {
        
    }
    
       public void paint(Graphics g){
        // g.setColor(Color.BLACK);
        //  Dimension size = getSize();
        // g.fillRect(0, 0, size.width, size.height);
        //   g.drawPolygon(new int[] {980,1000,990}, new int[] {1000,1000,900}, 3);
        //   g.setColor(Color.WHITE);
        //   g.fillPolygon(new int[] {980,1000,990}, new int[] {1000,1000,900}, 3);
        // g.fillRect(raumschiff.getX(), raumschiff.getY(), 
        //raumschiff.getSeitenlaengeX(),raumschiff.getSeitenlaengeY());
        ImageIcon ricon = new ImageIcon("H:/Dodge the Trümmerfeld/Hauptmenü.png");
        JLabel rlabel = new JLabel(ricon,JLabel.CENTER);
        fenster.getContentPane().add(rlabel);
    }
}
