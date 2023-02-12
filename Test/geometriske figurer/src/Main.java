import java.lang.Math;

abstract class GeometriskeFigurer{
    public abstract double Areal();
}

class Sirkel extends GeometriskeFigurer{
    private double r;
    public Sirkel(double r){
        this.r = r;
    }

    public double Areal(){
        double areal = Math.PI * Math.pow(r, 2);
        return areal;
    }
}

// TODO rektangel
class Rektangel extends GeometriskeFigurer{
    private double l;
    private double b;
    public Rektangel(double l, double b){
        this.l = l;
        this.b = b;
    }

    public double Areal(){
        double areal = l * b;
        return areal;
    }
}

// TODO kvadrater
class Kvadrat extends GeometriskeFigurer{
    private double l;
    public Kvadrat(double l){
        this.l = l;
    }

    public double Areal(){
        double areal = 4 * l;
        return areal;
    }
}

// TODO trekant
class Trekant extends GeometriskeFigurer{
    // (g * h) / 2
    private double h;
    private double b;
    public Trekant(double h, double b){
        this.h = h;
        this.b = b;
    }

    public double Areal(){
        double areal = (h * b) / 2;
        return areal;
    }
}


public class Main{
    public static void main(String[] args) {
        Trekant trekant = new Trekant(2, 3);
        Sirkel sirkel = new Sirkel(3);
        Rektangel rektangel = new Rektangel(3, 7);
        Kvadrat kvadrat = new Kvadrat(4);

        double trekantAreal = trekant.Areal();
        double sirkelAreal = sirkel.Areal();
        double rektangelAreal = rektangel.Areal();
        double kvadratAreal = kvadrat.Areal();

        double sum = trekantAreal + sirkelAreal + rektangelAreal + kvadratAreal;

        System.out.println(sum);
    }
}