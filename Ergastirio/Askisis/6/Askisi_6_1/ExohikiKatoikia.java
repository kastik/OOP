package Askisi_6_1;
public class ExohikiKatoikia extends Katoikia{
    private double TimiEx;
    ExohikiKatoikia(int kodikos,int pl_domation, double tetragonika,String diefthinsi,double timi){
    super(kodikos,pl_domation,tetragonika,diefthinsi);
    timi=TimiEx;
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
        return TimiEx*2+TimiEx*0.5;
        else
            return TimiEx+1200;
    }
}
