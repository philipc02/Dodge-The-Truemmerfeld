import java.awt.event.*;

public class Controller implements KeyListener
{
    private Raumschiff raumschiff;
    private View view;

    public Controller(){
        raumschiff = new Raumschiff();
        view = new View(raumschiff);
        view.addKeyListener(this);
    }

    public void keyReleased(KeyEvent e){}

    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            raumschiff.nachRechtsBewegen();
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            raumschiff.nachLinksBewegen();
        }
        if(e.getKeyCode() == KeyEvent.VK_UP){
            raumschiff.nachObenBewegen();
        }
    }

    public void runGameWithTimer(){
        long time = System.currentTimeMillis();
        long endTime = time + 60*1000;
        while (System.currentTimeMillis() < endTime) {
         
        }
    }
    
    public void keyTyped(KeyEvent e) {}
}
