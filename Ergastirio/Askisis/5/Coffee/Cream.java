package com.kastik.ergastirio5;
public class Cream {
    private int typosCre;
    Cream(int typosCre){
        this.typosCre=typosCre;
    }
    public String getTyposCre(){
        switch(typosCre){
            case 0: return "xoris krema";
            case 1: return "me afrogala";
            case 2: return "fitiki";
            default: return "me gala";
        }
    }
}
