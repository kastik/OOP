package Askisi_6_2;
abstract class Shape {
    private double x,y;
    Shape(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getx(){
        return x;
    }
    public double gety(){
        return y;
    }
    abstract double area();

    public static void main(String[] args){
        Shape[] arr = new Shape[4];
        arr[0] = new Rectangle(15,45,0,0); //Width,Height,X,Y
        arr[1] = new Rectangle(34,10,0,0); //Width,Height,X,Y
        arr[2] = new Circle(34,0,0); //Radius,X,Y
        arr[3] = new Circle(13,0,0); //Radius,X,Y
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].toString());
        }
    }
}