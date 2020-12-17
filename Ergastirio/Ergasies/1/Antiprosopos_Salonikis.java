package com.kastik.ergasia1;
public class Antiprosopos_Salonikis extends Antiprosopoi_Poliseon{
    private double exoda_MetakinisisTaxidion;
    Antiprosopos_Salonikis(String eponymia,double posoPoliseon,int kodikos_Bonus,double exoda_MetakinisisTaxidion){
        super(eponymia,posoPoliseon,kodikos_Bonus);
        this.exoda_MetakinisisTaxidion=exoda_MetakinisisTaxidion;
    }
    @Override
    public String getCityType(){
        return "Thessaloniki";
    }
    @Override
    public String getBonusType(){
        if(kodikos_Bonus==0){
            return "No Bonus";
        }
        else{
            return "Bonus";
        }
    }
    @Override
    public void TelikoPosoPromitheias(){
        if(kodikos_Bonus==0){
            System.out.println("Teliko Poso Promithias: "+(posoPoliseon * 0.05 + exoda_MetakinisisTaxidion));
            }
        else{
            System.out.println("Teliko Poso Promithias: "+(posoPoliseon * 0.05 + exoda_MetakinisisTaxidion+1000));
        }
    }
    
    
}

