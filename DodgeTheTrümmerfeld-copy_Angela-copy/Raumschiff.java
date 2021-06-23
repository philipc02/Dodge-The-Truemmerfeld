import java.util.ArrayList;

public class Raumschiff 
{
    private int x1, x2, x3, y1, y2, y3;
    private ArrayList<ModelBeobachter> beobachter; 
    
    public Raumschiff(){
        x1 = 980;
        x2 = 990;
        x3 = 985;
        y1 = 900;
        y2 = 900;
        y3 = 880;
        
        beobachter = new ArrayList<ModelBeobachter>();
    }
    
    public int getX1(){
        return x1;
    }
    
    public int getX2(){
        return x2;
    }
    
    public int getX3(){
        return x3;
    }
    
    public int getY1(){
        return y1;
    }
    
    public int getY2(){
        return y2;
    }
    
    public int getY3(){
        return y3;
    }
    
    //public int getSeitenlaengeX(){
       // return seitenlaengeX;
    //}
    
    //public int getSeitenlaengeY(){
      //  return seitenlaengeY;
    //}
    
    public void anmelden(ModelBeobachter b){
        beobachter.add(b);
    }
    
    public void abmelden(ModelBeobachter b){
        beobachter.remove(b);
    }
    
    private void alleInformieren(){
        for (ModelBeobachter b : beobachter){
            b.raumschiffGeaendert();
        }
    }
    
    void nachRechtsBewegen(){
        if(x1<1200){
            x1 = x1 + 5;
            x2 = x2 + 5;
            x3 = x3 + 5;
        }
        alleInformieren();
    }
    
    void nachLinksBewegen(){
        if(x1>800){
            x1 = x1 - 5;
            x2 = x2 - 5;
            x3 = x3 - 5;
        }
        alleInformieren();
    }
    
    void nachObenBewegen(){
        y1 = y1 - 10;
        y2 = y2 - 10;
        y3 = y3 - 10;
        alleInformieren();
    }
}
