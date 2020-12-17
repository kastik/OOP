package Askisi_6_1;
public class Diamerisma extends Katoikia{
    private double TimiD;
    Diamerisma(int kodikos,int pl_domation, double tetragonika,String diefthinsi,double TimiD){
    super(kodikos,pl_domation,tetragonika,diefthinsi);
    this.TimiD=TimiD;
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
        return TimiD*2+TimiD*0.5;
        else
            return TimiD+1200;
    }
}
