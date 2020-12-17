package Askisi_6_3;
public class Rectangle extends GeometricObject{
    private int width,height;
    Rectangle(int width,int height,String color,boolean filled){
        super(color,filled);
        this.height=height;
        this.width=width;
    }
    @Override
    public double getArea(){
        return (width*height);
    }
    @Override
    public double getPerimiter(){
        return (2*(width*height));
    }
    @Override
    public String toString(){
        return ("\nRectangle:\n Area: "+getArea()+"\n Perimiter: "+getPerimiter());
    }
}
