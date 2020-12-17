package com.kastik.ergasia1;
public class Antiprosopos_OtherCity extends Antiprosopoi_Poliseon{
    Antiprosopos_OtherCity(String eponymia,double posoPoliseon,int kodikos_Bonus){
        super(eponymia,posoPoliseon,kodikos_Bonus);
    }
    @Override
    public String getCityType(){
        return "Other City";
    }
    @Override
    public String getBonusType(){
        if(kodikos_Bonus==0){
            return "No bonus";
        }
        else{
            return "Bonus";
        }
    }
    @Override
    public void TelikoPosoPromitheias(){
        if(kodikos_Bonus==0){
        System.out.println("Teliko Poso Promithias: "+(posoPoliseon * 0.09));
        }
        else{
            System.out.println("Teliko Poso Promithias: "+(posoPoliseon * 0.09 + 4000));
        }
    }
    
    
}
