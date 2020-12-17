package com.kastik.ergasia1;
abstract class Antiprosopoi_Poliseon {
    String eponymia;
    double posoPoliseon;
    int CityType,kodikos_Bonus;
    double poso_promithias;
    Antiprosopoi_Poliseon(String eponymia,double posoPoliseon,int kodikos_Bonus){
        this.eponymia=eponymia;
        this.posoPoliseon=posoPoliseon;
        this.kodikos_Bonus=kodikos_Bonus;
    }
    public String getCityType(){
        return ""; // ginete override stis ipoklasis
    }
    abstract String getBonusType();
    abstract void TelikoPosoPromitheias();
    @Override
    public String toString(){
        return  "\nEponimo:" +eponymia+ "\nPosoPoliseon: " +posoPoliseon+ "\nCityType: " +getCityType()+"\nBonus:" +getBonusType();
    }
    public String getEponimo(){
        return eponymia;
    }
}
