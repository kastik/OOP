package com.kastik.ergastirio5;
public class Coffee {
    String coffeeName;
    private int typosKafe,sweetnes,dosi;
    private float price;
    Sugar typosSug;
    Cream typosCre;
    Coffee(int typosKafe,int sweetnes,int dosi,float price,Sugar typosSug,Cream typosCre){
        this.typosKafe=typosKafe;
        this.sweetnes=sweetnes;
        this.dosi=dosi;
        this.price=price;
        this.typosSug=typosSug;
        this.typosCre=typosCre;
    }
    public String getCoffeeName(){
        return coffeeName;
    }
    public String getTyposKafe(){
        if(typosKafe==1){
            return "kanonikos";
        }
        else{
        return "decaf";
        }
    }
    public String getSweetnes(){
        switch(sweetnes){
            case 1:return "glykos";
            case 2:return "metrios";
            default: return "sketos";
        }
    }
    public String getDosi(){
        if(dosi==1){
            return "monos";
        }
        else{
            return "diplos";
        }
    }
    public float getPrice(){
        return price;
    }
}