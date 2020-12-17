package Askisi_6_3;
abstract class GeometricObject {
    GeometricObject(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    private String color;
    private boolean filled;
    
    public boolean isFilled(){
        return filled;
    }
    abstract double getArea();
    abstract double getPerimiter();
}
