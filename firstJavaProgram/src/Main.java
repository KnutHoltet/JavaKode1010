import java.util.Objects;

class Rektangel{
    private double l;
    private double b;

    public Rektangel(double l, double b){
        this.l = l;
        this.b = b;
    }
    public void oekLengde(int okning){
        this.l += okning;
    }
    public void oekBredde(int okning){
        this.b += okning;
    }
    public double areal(){
        double areal = this.l * this.b;
        return areal;
    }
    public double omkrets(){
        double omkrets = 2*(this.l) + 2*(this.b);
        return omkrets;
    }
}

public class Main{
    public static void main(String[]args){
        Rektangel rektangel = new Rektangel(2.2, 3.3);
        System.out.println(rektangel.areal() + " " + rektangel.omkrets());
    }
}