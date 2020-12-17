package Askisi_6_1;
public class Mesonette extends Katoikia{
    private double TimiM;
    Mesonette(int kodikos,int pl_domation, double tetragonika,String diefthinsi,double timi){
    super(kodikos,pl_domation,tetragonika,diefthinsi);
    timi=TimiM;
    }
     @Override
    public String TyposSynalagis(){
        if (getKodikos()==1)
            return "Polisi";
        else 
            return "Enikiasi";
    }
    @Override
    public double Poso(){
        if(getKodikos()==1)
        return TimiM*2+TimiM*0.5;
        else
            return TimiM+1200;
    }
    
}
