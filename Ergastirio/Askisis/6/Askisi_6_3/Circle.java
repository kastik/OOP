package Askisi_6_3;
public class Circle extends GeometricObject{
    private double radius;
    Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    @Override
    public double getArea(){
        return (radius * radius * Math.PI);
    }
    @Override
    public double getPerimiter(){
        return (2*(radius*Math.PI));
    }
    @Override
    public String toString(){
        return ("\nCircle:\n Area: "+getArea()+"\n Perimiter: "+getPerimiter());
    }
}
