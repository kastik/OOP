package com.kastik.ergastirio5;

public class Sugar {
    private int typosSug;
    Sugar(int typosSug){
        this.typosSug=typosSug;
    }
    public String gettyposSug(){
        if(typosSug==1){
            return "white";
        }
        else{
            return "brown";
        }
    }
}
