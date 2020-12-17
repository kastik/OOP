package Askisi_6_3;
public class Cylinder extends Circle{
    private int height;
    private double radius;
    Cylinder(int height,double radius,boolean filled,String color){
        super(radius,color,filled);
        this.height=height;
    }
    @Override
    public double getArea(){
        return (super.getArea() * height);
    }

    public double Volume(){
        return (getArea()*height);
    }

    @Override
    public String toString(){
        return ("\nRectangle:\n Area: "+getArea()+"\n Volume: "+Volume());
    }
}
