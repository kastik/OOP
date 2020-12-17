
package com.kastik.ergastirio5;
public class Capuccino extends Coffee{
    private String gefsi;
    private int iced,kanela;
    Capuccino(int typosKafe,int sweetnes,int dosi,float price,Sugar typosSug,Cream typosCre,String gefsi,int iced,int kanela){
        super(typosKafe,sweetnes,dosi,price,typosSug,typosCre);
        this.gefsi=gefsi;
        this.iced=iced;
        this.kanela=kanela;
        coffeeName="Capuccino";
    }
    public String getIced(){
            if(iced==1){
                return "Pagomeno";
            }
            else{
                return "Zesto";
            }
    }
    public String getGefsi(){
        return gefsi;
    }
    public String getKanela(){
        if(kanela==1){
            return "Me Kanela";
        }
        else{
            return "Xoris Kanela";
        }
    }
}
