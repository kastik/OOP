package com.kastik.ergastirio5.Tilefono;
public class Tilefono {
    double LeptaOmilias,SinKostos=0;
    Tilefono(){
    }
    public String TyposThlefonou(){
        return "";
    }
    public void klisiStatherou(double LeptaOmilias){
        SinKostos=SinKostos+LeptaOmilias*0.10;
    }
    public void klisiKinitou(double LeptaOmilias){
        SinKostos=SinKostos+LeptaOmilias*0.20;
    }
    @Override
    public String toString(){
        return "Typos: "+TyposThlefonou()+"Sinoliko kostos: "+SinKostos;
    }
    public double getSinKostos(){
        return SinKostos;
    }
}
