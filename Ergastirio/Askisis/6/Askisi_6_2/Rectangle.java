package Askisi_6_2;
public class Rectangle extends Shape{
    private double width,height;
    Rectangle(double width,double height,double x,double y){
        super(x,y);
        this.width=width;
        this.height=height;
    }
    @Override
    public double area(){
        return (height*width);
    }
    @Override
    public String toString(){
        return "Area= "+area();
    }
}
