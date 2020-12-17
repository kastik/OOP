package com.kastik.theoerg1;
public class Vessel {
    String name,owner_name;
    double mikos,platos,max_speed,ektopisma;
    int etos_kataskevis;
    Vessel(String name,String owner_name,double mikos,double platos,double max_speed,int etos_kataskevis,double ektopisma){
        this.name=name;
        this.owner_name=owner_name;
        this.mikos=mikos;
        this.platos=platos;
        this.max_speed=max_speed;
        this.etos_kataskevis=etos_kataskevis;
        this.ektopisma=ektopisma;
    }
    public int getEtos(){
        return etos_kataskevis;
    }
    public String getName(){
        return name;
    }
    public double getMikos(){
        return mikos;
    }
    public double getEktopisma(){
        return ektopisma;
    }
    @Override
    public String toString(){
        return "\n Onoma Skafous: "+name+"\n Onoma katoxou: "+owner_name+"\n Mikos: "+mikos+"\n Platos: "+platos+"\n Max speed: "+max_speed+"\n Etos kataskevis: "+etos_kataskevis+"\n Ektopisma: "+ektopisma;
    }
}
