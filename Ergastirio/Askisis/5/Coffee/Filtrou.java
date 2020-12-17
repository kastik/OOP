
package com.kastik.ergastirio5;
public class Filtrou extends Coffee{
    private String gefsi;
    Filtrou(int typosKafe,int sweetnes,int dosi,float price,Sugar typosSug,Cream typosCre,String gefsi){
        super(typosKafe,sweetnes,dosi,price,typosSug,typosCre);
        this.gefsi=gefsi;
        coffeeName="Filtrou";
    }
    public String getGefsi(){
        return gefsi;
    }
}
