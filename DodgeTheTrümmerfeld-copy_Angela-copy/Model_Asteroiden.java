import java.util.ArrayList;

public class Model_Asteroiden
{
    private int x, y, radius;
    private ArrayList<ModelBeobachter> beobachter; 

    public Model_Asteroiden(int X, int Y){
        x = X;
        y = Y;
        radius = 50;
        beobachter = new ArrayList<ModelBeobachter>();
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getRadius(){
        return radius;
    }

    public void anmelden(ModelBeobachter b){
        beobachter.add(b);
    }

    public void abmelden(ModelBeobachter b){
        beobachter.remove(b);
    }

    private void alleInformieren(){
        for (ModelBeobachter b : beobachter){
            b.asteroidGeaendert();
        }
    }

    public void nachUntenBewegen(){
        y = y - 10;
        alleInformieren();
    }
}
