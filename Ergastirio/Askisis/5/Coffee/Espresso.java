
package com.kastik.ergastirio5;
public class Espresso extends Coffee{
        private String gefsi;
        private int iced;
        Espresso(int typosKafe,int sweetnes,int dosi,float price,Sugar typosSug,Cream typosCre,String gefsi,int iced){
        super(typosKafe,sweetnes,dosi,price,typosSug,typosCre);
        this.gefsi=gefsi;
        this.iced=iced;
        coffeeName="Espresso";
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

}