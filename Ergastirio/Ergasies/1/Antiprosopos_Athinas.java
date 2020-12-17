package com.kastik.ergasia1;
public class Antiprosopos_Athinas extends Antiprosopoi_Poliseon{
    double exoda_diafimisis,exoda_MetakinisisTaxidion;
    Antiprosopos_Athinas(String eponymia,double posoPoliseon,int kodikos_Bonus,double exoda_diafimisis,double exoda_MetakinisisTaxidion){
        super(eponymia,posoPoliseon,kodikos_Bonus);
        this.exoda_diafimisis=exoda_diafimisis;
        this.exoda_MetakinisisTaxidion=exoda_MetakinisisTaxidion;
    }
    @Override
    public String getCityType(){
        return "Athina";
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
        if(kodikos_Bonus==1){
            System.out.println("Teliko poso promithias: " +(posoPoliseon * 0.03 + exoda_diafimisis + exoda_MetakinisisTaxidion + 2000));
        }
        else{
            System.out.println("Teliko Poso Promithias: "+(posoPoliseon * 0.03 + exoda_diafimisis + exoda_MetakinisisTaxidion));
        }
    }
}
