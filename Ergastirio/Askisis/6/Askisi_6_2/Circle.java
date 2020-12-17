package Askisi_6_2;
public class Circle extends Shape{
    private double radius;
    Circle(double radius,double x,double y){
        super(x,y);
        this.radius=radius;
    }
    @Override
    public double area(){
        return (Math.PI * radius * radius);
    }
    @Override
    public String toString(){
        return ("Radius= "+area());
    }
}
