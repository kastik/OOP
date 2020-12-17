/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kastik.ergastirio5;

/**
 *
 * @author Anastasia
 */
public class Frappe extends Coffee{
    private String gefsi;
    private int iced;
    Frappe(int typosKafe,int sweetnes,int dosi,float price,Sugar typosSug,Cream typosCre,String gefsi,int iced){
        super(typosKafe,sweetnes,dosi,price,typosSug,typosCre);
        this.gefsi=gefsi;
        this.iced=iced;
        coffeeName="Frappe";
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
